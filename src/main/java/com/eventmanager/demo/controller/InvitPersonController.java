package com.eventmanager.demo.controller;

import com.eventmanager.demo.entity.InvitGroup;
import com.eventmanager.demo.entity.InvitPerson;
import com.eventmanager.demo.service.serviceInterface.InvitGroupServiceInterface;
import com.eventmanager.demo.service.serviceInterface.InvitPersonServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.web.bind.annotation.*;
import sun.awt.AWTIcon32_java_icon16_png;

import static java.lang.Integer.parseInt;

@RestController
public class InvitPersonController {

    @Autowired
    private InvitPersonServiceInterface invitPersonServiceInterface;



    @PostMapping("/yo")
    public String afficherHello(){

        InvitPerson invitPerson=new InvitPerson("Raja", "Alex", 26);
        invitPersonServiceInterface.save(invitPerson);
        InvitPerson invitPerson1=new InvitPerson("Nag's", "Ravi", 26);
        invitPersonServiceInterface.save(invitPerson1);
        InvitPerson invitPerson2=new InvitPerson("Seur", "Audrey", 26);
        invitPersonServiceInterface.save(invitPerson2);
        InvitPerson invitPerson3=new InvitPerson("Hallouf", "Simo", 26);
        invitPersonServiceInterface.save(invitPerson3);
        InvitPerson invitPerson4=new InvitPerson("Abich", "Sami", 26);
        invitPersonServiceInterface.save(invitPerson4);
        InvitPerson invitPerson5=new InvitPerson("Bang", "Hassan", 26);
        invitPersonServiceInterface.save(invitPerson5);
        InvitPerson invitPerson6=new InvitPerson("Mugiwara", "Luffy", 26);
        invitPersonServiceInterface.save(invitPerson6);
        InvitPerson invitPerson7=new InvitPerson("Roronoa", "Zoro", 26);
        invitPersonServiceInterface.save(invitPerson7);







        InvitGroup invitGroup=new InvitGroup("groupe", "groupetype");
//        invitGroupServiceInterface.save(invitGroup);


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

//        return "yo";
        return invitPersonServiceInterface.listAllInvitPerson();
    }



    @PostMapping(value = "/newInvitPerson", produces = {"application/json"})
    public InvitPerson newInvitPerson(/*@PathVariable String firstName,*/
                                      @RequestParam(defaultValue = "", required = true) String firstName,/*@RequestBody String firstName,@RequestBody String lastName, @RequestBody String age*/
//                                      @PathVariable String lastName,
                                      @RequestParam(defaultValue = "", required = true) String lastName,/*@RequestBody*//* String lastName,
//                                      @PathVariable int age*/
                                      @RequestParam(defaultValue = "12",required = true) String age){

                  InvitPerson invitPerson = new InvitPerson(firstName, lastName, parseInt(age));
//                  invitPersonServiceInterface.save(invitPerson);

//                  return "yo";
                  return invitPersonServiceInterface.save(invitPerson);

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


/*    @PutMapping(value = "/invitPerson/firstName", produces = "application.json")
    public InvitPerson putFirstName(@RequestParam() String newFirstName,
                                    @RequestParam() String firstName,
                                    @RequestParam() String lastName){

        invitPersonServiceInterface.getById(lastName, firstName).setInvitPersonFirstName(newFirstName);
        return invitPersonServiceInterface.getById(lastName, firstName);
    }*/





    @PutMapping(value = "/invitPerson")
    public InvitPerson modifyPerson(@RequestParam() Long id,
                             @RequestBody InvitPerson invitPerson){

        InvitPerson i=invitPersonServiceInterface.getById(id);

        if(i!=null){
            i=invitPerson;
            invitPersonServiceInterface.save(i);
        }

        return i;
    }


    @DeleteMapping(value = "/deleteInvitPerson")
    public Iterable<InvitPerson> deletePerson(@RequestParam() Long id){

        invitPersonServiceInterface.delete(id);
        return invitPersonServiceInterface.listAllInvitPerson();
    }

}
