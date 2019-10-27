package com.HashWolf2.hashwolf2.Model;

import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@javax.persistence.Entity
@Access(value=AccessType.FIELD)
@Table(name = "groupTable")
public class GroupTable {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "groupID")
    private int groupID;

    @Column(name = "groupName")
    private String groupName;


    @ManyToMany(mappedBy = "userGroups")
    private List<User> groupUsers;

    @Column(name = "payments")
    @OneToMany
    @JoinColumn(name = "groupID",referencedColumnName = "groupID")
    private List<Payment> payments;

    @Column(name = "groupDes")
    private String groupDes;

    public GroupTable() {
        this.groupName = "NULL";
        this.groupUsers = new ArrayList<User>();
        this.payments = new ArrayList<Payment>();
    }

    public GroupTable(String groupName, List<User> users, List<Payment> payments) {
        //this.groupID = groupID;
        this.groupName = groupName;
        if (users == null) {
            this.groupUsers = new ArrayList<User>();
        } else {
            this.groupUsers = users;
        }

        if (payments == null) {
            this.payments = new ArrayList<Payment>();
        } else {
            this.payments = payments;
        }
    }



    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<User> getUsers() {
        return groupUsers;
    }

    public void setUsers(List<User> users) {
        this.groupUsers = users;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public String getGroupDes() {
        return groupDes;
    }

    public void setGroupDes(String groupDes) {
        this.groupDes = groupDes;
    }

    public boolean containsUser(User user) {
        int uid = user.getUserid();
        for (User u : groupUsers) {
            if (uid == u.getUserid()) {
                return true;
            }
        }
        return false;
    }

    public void insertUser(User user) {
        if (containsUser(user)) {
            return;
        }
        groupUsers.add(user);
    }





}
