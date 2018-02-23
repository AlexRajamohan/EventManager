package com.eventmanager.demo.service.serviceImpl;

import com.eventmanager.demo.entity.Event;
import com.eventmanager.demo.repository.EventRepository;
import com.eventmanager.demo.service.serviceInterface.EventServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Optional;

/**
 * Created by audrey
 */

@Service
public class EventService implements EventServiceInterface{

        private EventRepository eventRepository;

        @Autowired
       public void setEventRepository(EventRepository eventRepository) {
            this.eventRepository = eventRepository;
        }

        @Override
        public Iterable<Event> listAllEvent() {
            return eventRepository.findAll();
        }


        @Override
        public Optional<Event> getEventById(Long id) {
            return eventRepository.findById(id);
        }

        @Override
        public Event saveEvent(Event event) {
            return eventRepository.save(event);
        }


        public void deleteEvent(Event event) {
            eventRepository.delete(event);
        }

}
