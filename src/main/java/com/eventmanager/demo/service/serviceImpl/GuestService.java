package com.eventmanager.demo.service.serviceImpl;

import com.eventmanager.demo.entity.Guest;
import com.eventmanager.demo.repository.GuestRepository;
import com.eventmanager.demo.service.serviceInterface.GuestServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestService implements GuestServiceInterface {

    private GuestRepository guestRepository;

    @Autowired
    public void setGuestRepository(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }


    @Override
    public Iterable<Guest> listAllGuest(){
       return guestRepository.findAll();
    }

    @Override
    public Guest saveGuest(Guest guest){
       return guestRepository.save(guest);
    }





}
