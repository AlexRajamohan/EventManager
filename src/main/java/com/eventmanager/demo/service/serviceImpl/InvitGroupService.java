package com.eventmanager.demo.service.serviceImpl;

import com.eventmanager.demo.entity.InvitGroup;
import com.eventmanager.demo.repository.InvitGroupRepository;
import com.eventmanager.demo.service.serviceInterface.InvitGroupServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InvitGroupService implements InvitGroupServiceInterface {

    private InvitGroupRepository invitGroupRepository;

    @Autowired
    public void setInvitGroupRepository(InvitGroupRepository invitGroupRepository) {
        this.invitGroupRepository = invitGroupRepository;
    }

    @Override
    public Iterable<InvitGroup> listAllInvitGroup(){
        return invitGroupRepository.findAll();

    }
    @Override
    public InvitGroup save(InvitGroup invitGroup){
        return invitGroupRepository.save(invitGroup);
    }


    @Override
    public InvitGroup getById(Long id){return invitGroupRepository.getOne(id);}

    @Override
    public void delete(Long id){invitGroupRepository.deleteById(id);}
}
