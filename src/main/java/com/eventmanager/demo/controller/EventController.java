package com.eventmanager.demo.controller;/*package com.eventmanager.demo.controller;



/**
 * Created by audrey
 */

import com.eventmanager.demo.entity.Event;
import com.eventmanager.demo.service.serviceInterface.EventServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

import static java.lang.Boolean.parseBoolean;
import static java.lang.Integer.parseInt;

@RestController
public class EventController {

        @Autowired
        private EventServiceInterface eventService;


        @GetMapping(value = "/event", produces = {"application/json"})
        public Iterable<Event> getAllEvent(){

               return eventService.listAllEvent();
        }

        @PostMapping(value = "/newEvent", produces = {"application/json"})
        public Event newEvent(@RequestParam() Date date,
                     @RequestParam() String type,
                     @RequestParam() String budget,
                     @RequestParam() String invitByGroup
                                 ){
            Boolean b=parseBoolean(invitByGroup);

            Event event=new Event(date, type, parseInt(budget), b );
            return eventService.saveEvent(event);
        }


    @PostMapping(value = "/creatEvent", produces = {"application/json"})
    public Event creatEvent(){
            Date date =new Date();
            Event event=new Event(date, "type", 300, false);
            eventService.saveEvent(event);

            return event;
    }


    @PutMapping(value = "/event")
    public Event modifyEvent(@RequestParam() Long id,
                             @RequestBody Event event){

            Event e=eventService.getEventById(id);

            if(e!=null){
                e=event;
                eventService.saveEvent(e);
            }

            return e;
    }



    @DeleteMapping(value = "/deleteEvent")
    public Iterable<Event> deleteEvent(@RequestParam() Long id){

        eventService.deleteEvent(id);
        return eventService.listAllEvent();
    }


}