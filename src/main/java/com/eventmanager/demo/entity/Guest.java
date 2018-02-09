package com.eventmanager.demo.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="guest")
public class Guest implements Serializable{

    @Column(name="first_name", nullable = false)
    private String firstName;

    @Column(name= "last_name",nullable = false)
    private String lastName;

    //    @GeneratedValue
    @Id
    @Column(name="id", nullable = false)
    private float id;


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public Guest(String lastName, String firstName){
        this.firstName=firstName;
        this.lastName=lastName;

    }
}
