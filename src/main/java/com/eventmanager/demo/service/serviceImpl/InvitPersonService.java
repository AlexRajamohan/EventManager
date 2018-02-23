package com.eventmanager.demo.service.serviceImpl;

import com.eventmanager.demo.entity.InvitPerson;
import com.eventmanager.demo.repository.InvitPersonRepository;
import com.eventmanager.demo.service.serviceInterface.InvitPersonServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvitPersonService implements InvitPersonServiceInterface {

    private InvitPersonRepository invitPersonRepository;

    @Autowired
    public void setInvitPersonRepository(InvitPersonRepository invitPersonRepository) {
        this.invitPersonRepository = invitPersonRepository;
    }


    @Override
    public Iterable<InvitPerson> listAllInvitPerson(){
       return invitPersonRepository.findAll();
    }

    @Override
    public InvitPerson saveInvitPerson(InvitPerson invitPerson){
       return invitPersonRepository.save(invitPerson);
    }





}
