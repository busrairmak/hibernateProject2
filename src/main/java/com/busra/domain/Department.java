package com.busra.domain;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Table
public class Department{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long depId;
    private String name;
    private String description;

    @ManyToMany
    @JoinColumn(name = "meetId")
    private Set<Meeting> meeting = new HashSet<Meeting>();


    public Department() {
    }

    public Department(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Long getDepId() {
        return depId;
    }

    public void setDepId(Long id) {
        this.depId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Set<Meeting> getMeeting() {
        return meeting;
    }

    public void setMeeting(Set<Meeting> meeting) {
        this.meeting = meeting;
    }
}