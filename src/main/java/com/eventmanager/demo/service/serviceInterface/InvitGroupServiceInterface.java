package com.eventmanager.demo.service.serviceInterface;

import com.eventmanager.demo.entity.InvitGroup;

import java.util.Optional;

public interface InvitGroupServiceInterface {
    Iterable<InvitGroup> listAllInvitGroup();
    InvitGroup save(InvitGroup invitGroup);
    InvitGroup getById(Long id);
    void delete(Long id);

}
