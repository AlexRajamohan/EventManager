package com.eventmanager.demo.controller;

import com.eventmanager.demo.entity.Guest;
import com.eventmanager.demo.service.serviceImpl.GuestService;
import com.eventmanager.demo.service.serviceInterface.GuestServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @Autowired
    private GuestServiceInterface guestServiceInterface;

    @RequestMapping("/yo")
    public String afficherHello(){

        Guest g=new Guest("A", "A");
        guestServiceInterface.saveGuest(g);


        for (Guest guest:guestServiceInterface.listAllGuest()){
            System.out.println(guest.getFirstName()+";"+guest.getLastName());
        }
        return "yo";
    }

    @RequestMapping("/newGuest")
    public String newGuest(@RequestParam(defaultValue = "", required = true) String firstName,
                                      @RequestParam(defaultValue = "", required = true) String lastName)
              {
                  Guest guest = new Guest(firstName, lastName);
                  guestServiceInterface.saveGuest(guest);

                  return "yo";

    }


}
