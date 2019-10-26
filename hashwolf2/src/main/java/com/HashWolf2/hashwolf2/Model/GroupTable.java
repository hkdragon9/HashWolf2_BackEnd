package com.HashWolf2.hashwolf2.Model;

import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
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


    //@Column(name = "users")
//    @ManyToMany(targetEntity=User.class)
//    @JoinColumn(name = "userID")
//    private List<User> groupUsers;

    @Column(name = "payments")
    @OneToMany    //(targetEntity=Payment.class, mappedBy="paymentGroup", fetch=FetchType.EAGER)
    @JoinColumn(name = "groupID",referencedColumnName = "groupID")
    private List<Payment> payments;

    @Column(name = "groupDes")
    private String groupDes;

    public GroupTable() {

    }

    public GroupTable(String groupName, List<User> users, List<Payment> payments) {
        //this.groupID = groupID;
        this.groupName = groupName;
        //this.groupUsers = users;
        this.payments = payments;
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

//    public List<User> getUsers() {
//        return groupUsers;
//    }
//
//    public void setUsers(List<User> users) {
//        this.groupUsers = users;
//    }

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





}
