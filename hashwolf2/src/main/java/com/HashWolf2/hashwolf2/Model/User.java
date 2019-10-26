package com.HashWolf2.hashwolf2.Model;


import javax.persistence.*;
import java.util.List;

@javax.persistence.Entity
@Access(value=AccessType.FIELD)
@Table(name = "user")
public class User {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userID")
    private int userid;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;



//    @ManyToMany(targetEntity=Group.class)
//    @JoinColumn(name = "groupID")
//    private List<Group> userGroups;

    public User(){
    }

    public User(String n, String e, List<GroupTable> GroupTables) {
        //userid = id;
        name = n;
        email = e;
        //this.userGroups = groups;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public List<Group> getGroups() {
//        return userGroups;
//    }
//
//    public void setGroups(List<Group> groups) {
//        this.userGroups = groups;
//    }
}
