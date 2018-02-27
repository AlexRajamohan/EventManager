package com.eventmanager.demo.service.serviceImpl;

import com.eventmanager.demo.entity.Event;
import com.eventmanager.demo.repository.EventRepository;
import com.eventmanager.demo.service.serviceInterface.EventServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



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
        public Event getEventById(Long id) {
//            return null;
            return eventRepository.getOne(id);
        }

        @Override
        public Event saveEvent(Event event) {
            return eventRepository.save(event);
        }


        public void deleteEvent(Long id) {
            eventRepository.deleteById(id);
        }

}
