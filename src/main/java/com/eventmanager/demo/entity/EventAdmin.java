package com.eventmanager.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by audre on 20/02/2018.
 */

@Entity
@Table(name="event_admin")
public class EventAdmin implements Serializable {

    @Id
    @Column(name="admin_id", nullable = false)
    @SequenceGenerator(name="event_admin_admin_id_seq", sequenceName="event_admin_admin_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "event_admin_admin_id_seq")
    private Long id;

    @Column(name= "admin_lastname",nullable = false)
    private String lastname;

    @Column(name="admin_firstname", nullable = false)
    private String firstname;

    @Column(name="admin_email", nullable = false)
    private String email;

    @Column(name="admin_phone", nullable = false)
    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public EventAdmin(String lastname, String firstname, String email, String phone) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.phone = phone;
    }

    public EventAdmin(){}
}
