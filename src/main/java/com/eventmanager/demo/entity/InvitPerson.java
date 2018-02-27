package com.eventmanager.demo.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "invit_person")
public class InvitPerson implements Serializable {


    @Id
    @Column(name = "invit_person_id", nullable = false)
    @SequenceGenerator(name="invit_person_id_seq", sequenceName="\"invit_person_id_seq\"", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "invit_person_id_seq")
    private Long invitPersonId;

    @Column(name = "invit_person_lastname", nullable = false)
    private String invitPersonLastName;

    @Column(name = "invit_person_firstname", nullable = false)
    private String invitPersonFirstName;

    @Column(name = "invit_person_age", nullable = false)
    private int invitPersonAge;

    public InvitPerson(){}
    public InvitPerson(String lastName, String firstName, int age){
        this.invitPersonLastName =lastName;
        this.invitPersonFirstName =firstName;
        this.invitPersonAge=age;
    }

//    public Long getInvitPersonId() {
//        return invitPersonId;
//    }

//    public void setInvitPersonId(Long invitPersonId) {
//        this.invitPersonId = invitPersonId;
//    }


    public Long getInvitPersonId() {
        return invitPersonId;
    }


    public void setId(Long id) {
        this.invitPersonId = id;
    }


    public String getInvitPersonLastName() {
        return invitPersonLastName;
    }

    public void setInvitPersonLastName(String invitPersonLastName) {
        this.invitPersonLastName = invitPersonLastName;
    }

    public String getInvitPersonFirstName() {
        return invitPersonFirstName;
    }

    public void setInvitPersonFirstName(String invitPersonFirstName) {
        this.invitPersonFirstName = invitPersonFirstName;
    }

    public int getInvitPersonAge() {
        return invitPersonAge;
    }

    public void setInvitPersonAge(int invitPersonAge) {
        this.invitPersonAge = invitPersonAge;
    }
}
