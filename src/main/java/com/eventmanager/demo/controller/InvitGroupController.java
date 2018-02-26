package com.eventmanager.demo.controller;

import com.eventmanager.demo.entity.InvitGroup;
import com.eventmanager.demo.entity.InvitPerson;
import com.eventmanager.demo.service.serviceInterface.InvitGroupServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Integer.parseInt;

@RestController
public class InvitGroupController {


    @Autowired
    private InvitGroupServiceInterface invitGroupServiceInterface;



    @GetMapping(value= "/getAllInvitGroup", produces = { "application/json" })
    public Iterable<InvitGroup> getAllInvitGroup(){


        for (InvitGroup invitGroup: invitGroupServiceInterface.listAllInvitGroup()) {
            System.out.println(invitGroup.getGroupInvitable() + ";" + invitGroup.getGroupName());
        }

//        return "yo";
        return invitGroupServiceInterface.listAllInvitGroup();
    }



    @PostMapping(value = "/newInvitGroup", produces = {"application/json"})
    public InvitGroup newInvitGroup(@RequestParam(defaultValue = "", required = true) String groupName,
            @RequestParam(defaultValue = "", required = true) String groupType){

        InvitGroup invitGroup = new InvitGroup(groupName, groupType);
        invitGroupServiceInterface.save(invitGroup);

//                  return "yo";
        return invitGroupServiceInterface.save(invitGroup);

    }
}
