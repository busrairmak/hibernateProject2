package com.busra.domain;

import javax.persistence.*;

import static javax.persistence.GenerationType.*;

@Entity
@Table

public class Meeting {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long meetId;
    private String name;
    private String description;

    public Meeting() {
    }

    public Meeting(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Long getMeetId() {
        return meetId;
    }

    public void setMeetId(Long meetId) {
        this.meetId = meetId;
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
}
