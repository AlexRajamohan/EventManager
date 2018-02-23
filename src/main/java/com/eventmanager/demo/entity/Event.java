package com.eventmanager.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="event")
public class Event implements Serializable{

    @Id
    @Column(name="event_id", nullable = false)
    @SequenceGenerator(name="event_event_id_seq", sequenceName="event_event_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "event_event_id_seq")
    private Long id;

    @Column(name= "event_date",nullable = false)
    private Date date;

    @Column(name="event_type", nullable = false)
    private String type;

    @Column(name="event_budget", nullable = false)
    private float budget;

    @Column(name="event_invit_by_group", nullable = false)
    private boolean invit_by_group;


    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public float getBudget() {
        return budget;
    }

    public boolean isInvit_by_group() {
        return invit_by_group;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public void setInvit_by_group(boolean invit_by_group) {
        this.invit_by_group = invit_by_group;
    }

    public Event(Date date, String type, float budget, boolean invit_by_group) {
       // this.id = id;
        this.date = date;
        this.type = type;
        this.budget = budget;
        this.invit_by_group = invit_by_group;
    }

    public Event(){}
}
