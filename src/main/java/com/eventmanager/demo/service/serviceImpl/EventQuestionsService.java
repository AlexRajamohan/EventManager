package com.eventmanager.demo.service.serviceImpl;

import com.eventmanager.demo.entity.EventQuestions;
import com.eventmanager.demo.repository.EventQuestionsRepository;
import com.eventmanager.demo.service.serviceInterface.EventQuestionsServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by audre on 21/02/2018.
 */

@Service
public class EventQuestionsService implements EventQuestionsServiceInterface {

    private EventQuestionsRepository eventQuestionsRepository;

    @Autowired
    public void setEventQuestionsRepository(EventQuestionsRepository eventQuestionsRepository) {
        this.eventQuestionsRepository = eventQuestionsRepository;
    }

    @Override
    public Iterable<EventQuestions> listAllEventQuestions() {
        return eventQuestionsRepository.findAll();
    }


    @Override
    public Optional<EventQuestions> getEvenQuestionsById(Long id) {
        return eventQuestionsRepository.findById(id);
    }

    @Override
    public EventQuestions saveEventQuestions(EventQuestions eventQuestions) {
        return eventQuestionsRepository.save(eventQuestions);
    }


    public void deleteEventQuestions(EventQuestions eventQuestions) {
        eventQuestionsRepository.delete(eventQuestions);
    }

}


