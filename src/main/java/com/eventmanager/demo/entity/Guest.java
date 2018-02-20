package com.eventmanager.demo.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="guest")
public class Guest implements Serializable {

    //    @GeneratedValue
    @Id
    @Column(name="id")
    @SequenceGenerator(name="guest_id_seq", sequenceName="guest_id_seq")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "guest_id_seq")
    private Long id;

    @Column(name="first_name", nullable = false)
    private String firstName;

    @Column(name= "last_name",nullable = false)
    private String lastName;

    public Guest() {

    }

    public Guest(String lastName, String firstName) {
        this.firstName=firstName;
        this.lastName=lastName;
    }

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

}
