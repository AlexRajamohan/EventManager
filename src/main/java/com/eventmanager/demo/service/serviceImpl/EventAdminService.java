package com.eventmanager.demo.service.serviceImpl;

import com.eventmanager.demo.entity.EventAdmin;
import com.eventmanager.demo.repository.EventAdminRepository;
import com.eventmanager.demo.service.serviceInterface.EventAdminServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by audre on 21/02/2018.
 */

@Service
public class EventAdminService implements EventAdminServiceInterface {

    private EventAdminRepository eventAdminRepository;

    @Autowired
    public void setEventAdminRepository(EventAdminRepository eventAdminRepository) {
        this.eventAdminRepository = eventAdminRepository;
    }

    @Override
    public Iterable<EventAdmin> listAllEventAdmin() {
        return eventAdminRepository.findAll();
    }


    @Override
    public Optional<EventAdmin> getEventAdminById(Long id) {
        return eventAdminRepository.findById(id);
    }

    @Override
    public EventAdmin saveEventAdmin(EventAdmin eventAdmin) {
        return eventAdminRepository.save(eventAdmin);
    }


    public void deleteEventAdmin(EventAdmin eventAdmin) {
        eventAdminRepository.delete(eventAdmin);
    }

}
