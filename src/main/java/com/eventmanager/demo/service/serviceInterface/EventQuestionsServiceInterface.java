package com.eventmanager.demo.service.serviceInterface;

import com.eventmanager.demo.entity.EventQuestions;
import com.eventmanager.demo.repository.EventQuestionsRepository;

import java.util.Optional;

/**
 * Created by audre on 21/02/2018.
 */

public interface EventQuestionsServiceInterface {

    public void setEventQuestionsRepository(EventQuestionsRepository eventRepository);
    public Iterable<EventQuestions> listAllEventQuestions();
    public Optional<EventQuestions> getEvenQuestionsById(Long id);
    public EventQuestions saveEventQuestions(EventQuestions eventQuestions);
    public void deleteEventQuestions(EventQuestions eventQuestions);

}
