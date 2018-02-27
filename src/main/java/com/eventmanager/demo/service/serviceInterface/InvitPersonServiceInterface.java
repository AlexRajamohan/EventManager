package com.eventmanager.demo.service.serviceInterface;

import com.eventmanager.demo.entity.InvitPerson;

import java.util.Optional;

public interface InvitPersonServiceInterface {
    Iterable<InvitPerson> listAllInvitPerson();
    InvitPerson save(InvitPerson invitPerson);
    InvitPerson getById(Long id);
    void delete(Long id);
}
