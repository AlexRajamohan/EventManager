package com.eventmanager.demo.repository;

import com.eventmanager.demo.entity.EventQuestions;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by audre on 21/02/2018.
 */

public interface EventQuestionsRepository extends CrudRepository<EventQuestions, Long> {
}
