package com.eventmanager.demo.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by audre on 21/02/2018.
 */

    @Entity
    @Table(name="event_questions")
    public class EventQuestions implements Serializable {

        @Id
        @Column(name="question_id", nullable = false)
        @SequenceGenerator(name="event_questions_question_id_seq", sequenceName="event_questions_question_id_seq")
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "event_questions_question_id_seq")
        private Long id;

        @Column(name= "question_label",nullable = false)
        private String label;

        @Column(name="question_sublabel", nullable = false)
        private String sublabel;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getSublabel() {
            return sublabel;
        }

        public void setSublabel(String sublabel) {
            this.sublabel = sublabel;
        }


        public EventQuestions(String label, String sublabel) {
            this.label = label;
            this.sublabel = sublabel;
        }

        public EventQuestions(){}
    }
