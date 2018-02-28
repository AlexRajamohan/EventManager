package com.eventmanager.demo.controller;

import com.eventmanager.demo.entity.InvitGroup;
import com.eventmanager.demo.entity.InvitPerson;
import com.eventmanager.demo.service.serviceInterface.InvitGroupServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping(value = "/invitGroup")
    public InvitGroup modifyPerson(@RequestParam() Long id,
                                    @RequestParam(required = false) String groupName,
                                    @RequestParam(required = false) String groupType,
                                    @RequestParam(required = false) String groupInvitable ){

        InvitGroup i=invitGroupServiceInterface.getById(id);

        if(i!=null) {
            if (!groupName.isEmpty()) {
                i.setGroupName(groupName);
            }
            if (!groupType.isEmpty()){
                i.setGroupType(groupType);
            }
            if(!groupInvitable.isEmpty()){
                i.setGroupInvitable(parseInt(groupInvitable));
            }
        }

        return invitGroupServiceInterface.save(i);
    }


    @DeleteMapping(value = "/deleteInvitGroup")
    public Iterable<InvitGroup> deleteGroup(@RequestParam() Long id){

        invitGroupServiceInterface.delete(id);
        return invitGroupServiceInterface.listAllInvitGroup();
    }
}
