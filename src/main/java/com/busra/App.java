package com.busra;

import com.busra.domain.Department;
import com.busra.domain.Employee;
import com.busra.domain.Meeting;
import com.busra.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        //department
        Department department = new Department();
        department.setName("Mebitech");
        department.setDescription("devolopment");
        Department department1 = new Department();
        department1.setName("Mebitech");
        department1.setDescription("test analyst");


        session.save(department);
        session.save(department1);

        //Employe
        Employee employee = new Employee("büsra", "irmak", 2000);
        Employee employee1 = new Employee("adile", "gundoğdu", 2000);
        employee.setDepartment(department);
        employee1.setDepartment(department1);
        session.save(employee);
        session.save(employee1);

        //meeting
        Meeting meeting = new Meeting();
        meeting.setName("nivak");
        meeting.setDescription("blablabla");
        Set<Meeting> meetings = new HashSet<Meeting>();
        meetings.add(meeting);
        department.setMeeting(meetings);
        department1.setMeeting(meetings);

        session.save(meeting);


        session.getTransaction().commit();
        session.close();
    }

}
