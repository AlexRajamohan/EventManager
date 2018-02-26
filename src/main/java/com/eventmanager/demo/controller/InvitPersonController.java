package com.eventmanager.demo.controller;

import com.eventmanager.demo.entity.InvitGroup;
import com.eventmanager.demo.entity.InvitPerson;
import com.eventmanager.demo.service.serviceInterface.InvitGroupServiceInterface;
import com.eventmanager.demo.service.serviceInterface.InvitPersonServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static java.lang.Integer.parseInt;

@RestController
public class InvitPersonController {

    @Autowired
    private InvitPersonServiceInterface invitPersonServiceInterface;

    @Autowired
    private InvitGroupServiceInterface invitGroupServiceInterface;

    @PostMapping("/yo")
    public String afficherHello(){

        InvitPerson invitPerson=new InvitPerson("A", "A", 26);
        invitPersonServiceInterface.saveInvitPerson(invitPerson);
        InvitGroup invitGroup=new InvitGroup("groupe", "groupetype");
        invitGroupServiceInterface.saveInvitGroup(invitGroup);


/*        for (Guest guest: invitPersonServiceInterface.listAllGuest()){
            System.out.println(guest.getFirstName()+";"+guest.getLastName());
        }*/
        return "yo";
    }

    @GetMapping(value= "/getAllInvitPerson", produces = { "application/json" })
    public Iterable<InvitPerson> getAllInvitPerson(){

//        invitPersonServiceInterface.listAllInvitPerson();

        for (InvitPerson invitPerson: invitPersonServiceInterface.listAllInvitPerson()) {
            System.out.println(invitPerson.getInvitPersonFirstName() + ";" + invitPerson.getInvitPersonLastName());
        }

//        {"id":1,"content":"Hello, World!"}
//        return "yo";
        return invitPersonServiceInterface.listAllInvitPerson();
    }



    @PostMapping(value = "/newInvitPerson/{firstName}/{lastName}/{age}", produces = {"application/json"})

    public InvitPerson newInvitPerson(/*@PathVariable String firstName,*/
                                      /*@RequestParam(defaultValue = "", required = true)*/@RequestBody String firstName,@RequestBody String lastName, @RequestBody String age
//                                      @PathVariable String lastName,
                                      /*@RequestParam(defaultValue = "", required = true)*//*@RequestBody*//* String lastName,
//                                      @PathVariable int age
                                      @RequestParam(defaultValue = "12",required = true) int age*/){

                  InvitPerson invitPerson = new InvitPerson(firstName, lastName, parseInt(age));
                  invitPersonServiceInterface.saveInvitPerson(invitPerson);

//                  return "yo";
                  return invitPersonServiceInterface.saveInvitPerson(invitPerson);

    }


    /*    @RequestMapping(value = "/newInvitPerson", method = RequestMethod.POST, produces = {"application/json"})
    public InvitPerson newInvitPerson(@RequestParam(defaultValue = "", required = true) String firstName,
                                 @RequestParam(defaultValue = "", required = true) String lastName,
                                 @RequestParam(defaultValue = "12",required = true) int age){

                  InvitPerson invitPerson = new InvitPerson(firstName, lastName, age);
                  invitPersonServiceInterface.saveInvitPerson(invitPerson);

//                  return "yo";
                  return invitPersonServiceInterface.saveInvitPerson(invitPerson);

    }*/


}
