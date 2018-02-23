/*package com.eventmanager.demo.controller;

import com.eventmanager.demo.entity.Event;
import com.eventmanager.demo.service.serviceInterface.EventServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by audrey
 */

/*@Controller
public class EventController {

        @Autowired
        private EventServiceInterface eventService;


        @RequestMapping(value = "/log")
                public String displayLoginPage(){

                        return "signin/login";
                }

        @RequestMapping(value = "/logged", method = RequestMethod.POST)
                public String setSession(@RequestParam(value = "inputEmail") String inputEmail,
                                         @RequestParam(value = "inputPassword") String inputPassword,
                                         HttpServletRequest request){

                        Event event=eventService.getEventById();
                        request.getSession().setAttribute("adherent", adherent);
                        System.out.println(event.getEvent().getSolde());

                        return "redirect:/logged?email="+inputEmail+"&password="+inputPassword;
                }

}*/