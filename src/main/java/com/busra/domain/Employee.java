package com.busra.domain;

import org.hibernate.annotations.JoinColumnOrFormula;
import org.omg.CORBA.portable.IDLEntity;

import javax.persistence.*;
import java.security.Identity;

import static javax.persistence.GenerationType.*;

@Entity
@Table


public class Employee {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private Integer salary;

    @ManyToOne
    @JoinColumn(name = "depId")
    private Department department;


    public Employee() {
    }

    public Employee(String name, String surname, Integer salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}



