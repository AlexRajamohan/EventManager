package com.eventmanager.demo.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "invit_group")
public class InvitGroup {

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    @Id
    @Column(name = "invit_group_id")
    @SequenceGenerator(name="invit_group_id_seq_name", sequenceName="\"invit_group_id_seq\"", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "invit_group_id_seq_name")
    private Long groupId;

    @Column(name = "invit_group_name")
    private String groupName;

    @Column(name="invit_group_type")
    private String groupType;

    @Column(name = "invit_group_invitable")
    private int groupInvitable;


    public InvitGroup(){}
    public InvitGroup(String groupName, String groupType){
        this.groupName =groupName;
        this.groupType=groupType;
    }
    public Long getGroueId() {
        return groupId;
    }

    public void setGroueId(Long groueId) {
        this.groupId = groueId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public int getGroupInvitable() {
        return groupInvitable;
    }

    public void setGroupInvitable(int groupInvitable) {
        this.groupInvitable = groupInvitable;
    }
}
