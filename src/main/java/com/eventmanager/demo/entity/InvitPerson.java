package com.eventmanager.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "invit_person")
public class InvitPerson {

    @Id
    @Column(name = "invit_person_id")
    @SequenceGenerator(name="invit_person_id_seq", sequenceName="\"invit_person_id_seq\"", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "invit_person_id_seq")
    private Long invitPersonId;

    @Column(name = "invit_person_lastname")
    private String invitPersonLastName;

    @Column(name = "invit_person_firstname")
    private String invitPersonFirstName;

    @Column(name = "invit_person_age")
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
