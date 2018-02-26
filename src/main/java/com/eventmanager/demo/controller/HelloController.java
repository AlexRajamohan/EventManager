/*package com.eventmanager.demo.controller;

import com.eventmanager.demo.entity.Guest;
import com.eventmanager.demo.service.serviceImpl.GuestService;
import com.eventmanager.demo.service.serviceInterface.GuestServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @Autowired
    private GuestService guestService;

    @RequestMapping("/yo")
    public String afficherHello(){

        Guest g=new Guest("A", "R");
        guestService.saveGuest(g);


        for (Guest guest:guestService.listAllGuest()){
            System.out.println(guest.getFirstName()+";"+guest.getLastName());
//            System.out.println(guest.getFirstName());
        }
        return "yo";
    }


}
*/
