package com.eventmanager.demo.service.serviceInterface;

import com.eventmanager.demo.entity.Event;
import com.eventmanager.demo.repository.EventRepository;

import java.io.Serializable;
import java.util.Optional;

/**
 * Created by audrey.
 */
public interface EventServiceInterface {

    public void setEventRepository(EventRepository eventRepository);
    public Iterable<Event> listAllEvent();
    public Optional<Event> getEventById(Long id);
    public Event saveEvent(Event event);
    public void deleteEvent(Event event);

}