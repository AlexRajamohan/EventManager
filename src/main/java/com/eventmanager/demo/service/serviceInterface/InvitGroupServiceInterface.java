package com.eventmanager.demo.service.serviceInterface;

import com.eventmanager.demo.entity.InvitGroup;

public interface InvitGroupServiceInterface {
    Iterable<InvitGroup> listAllInvitGroup();
    InvitGroup saveInvitGroup(InvitGroup invitGroup);
}
