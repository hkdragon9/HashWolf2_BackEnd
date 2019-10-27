package com.HashWolf2.hashwolf2.Model;


import javax.persistence.*;
import java.util.ArrayList;
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



    @ManyToMany
    @JoinTable(name = "users_groups", joinColumns = @JoinColumn(name = "userID"),
            inverseJoinColumns = @JoinColumn(name = "groupID")
    )
    private List<GroupTable> userGroups;

    public User(){
        name = "NULL";
        email = "NULL";
        userGroups = new ArrayList<GroupTable>();
    }

    public User(String n, String e, List<GroupTable> GroupTables) {
        //userid = id;
        name = n;
        email = e;
        if (GroupTables == null) {
            userGroups = new ArrayList<GroupTable>();
        } else {
            this.userGroups = GroupTables;
        }
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

    public List<GroupTable> getGroups() {
        return userGroups;
    }

    public void setGroups(List<GroupTable> groups) {
        this.userGroups = groups;
    }


    public boolean containsGroup(GroupTable group) {
        int gid = group.getGroupID();
        for (GroupTable g : userGroups) {
            if (gid == g.getGroupID()) {
                return true;
            }
        }
        return false;
    }

    public void insertGroup(GroupTable group) {
        if (containsGroup(group)) {
            return;
        }
        userGroups.add(group);
    }
}
