package com.eventmanager.demo.service.serviceInterface;

import com.eventmanager.demo.entity.InvitPerson;

public interface InvitPersonServiceInterface {
    public Iterable<InvitPerson> listAllInvitPerson();
    public InvitPerson saveInvitPerson(InvitPerson invitPerson);
}
