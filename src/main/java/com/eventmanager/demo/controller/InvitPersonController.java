package com.eventmanager.demo.controller;

import com.eventmanager.demo.entity.InvitGroup;
import com.eventmanager.demo.entity.InvitPerson;
import com.eventmanager.demo.service.serviceInterface.InvitGroupServiceInterface;
import com.eventmanager.demo.service.serviceInterface.InvitPersonServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InvitPersonController {

    @Autowired
    private InvitPersonServiceInterface invitPersonServiceInterface;

    @Autowired
    private InvitGroupServiceInterface invitGroupServiceInterface;

    @RequestMapping("/yo")
    public String afficherHello(){

        InvitPerson invitPerson=new InvitPerson("A", "A");
        invitPersonServiceInterface.saveInvitPerson(invitPerson);

        InvitGroup invitGroup=new InvitGroup("groupe", "groupetype");
        invitGroupServiceInterface.saveInvitGroup(invitGroup);


/*        for (Guest guest: invitPersonServiceInterface.listAllGuest()){
            System.out.println(guest.getFirstName()+";"+guest.getLastName());
        }*/
        return "yo";
    }

    @RequestMapping(value = "/newGuest", method = RequestMethod.POST)
    public String newGuest(@RequestParam(defaultValue = "", required = true) String firstName,
                                      @RequestParam(defaultValue = "", required = true) String lastName)
              {
                  InvitPerson invitPerson = new InvitPerson(firstName, lastName);
                  invitPersonServiceInterface.saveInvitPerson(invitPerson);

                  return "yo";

    }


}
