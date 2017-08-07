package com.busra.util;

        import org.hibernate.SessionFactory;
        import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
    private static final SessionFactory sessionfactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            return  new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable e) {
            System.err.println("nitial SessionFactory creation failed."+e);
            throw  new ExceptionInInitializerError();

        }


    }

    public static SessionFactory getSessionFactory() {
        return sessionfactory;
    }
}
