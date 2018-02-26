package com.eventmanager.demo.service.serviceInterface;

import com.eventmanager.demo.entity.EventAdmin;
import com.eventmanager.demo.repository.EventAdminRepository;

import java.util.Optional;

/**
 * Created by audre on 21/02/2018.
 */

public interface EventAdminServiceInterface {

    public void setEventAdminRepository(EventAdminRepository eventAdminRepository);
    public Iterable<EventAdmin> listAllEventAdmin();
    public Optional<EventAdmin> getEventAdminById(Long id);
    public EventAdmin saveEventAdmin(EventAdmin eventadmin);
    public void deleteEventAdmin(EventAdmin eventadmin);
}
