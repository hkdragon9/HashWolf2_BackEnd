package com.HashWolf2.hashwolf2.Controllers;

import com.HashWolf2.hashwolf2.Model.Group;
import com.HashWolf2.hashwolf2.Model.User;
import com.HashWolf2.hashwolf2.Repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/group")
public class GroupController {

    @Autowired
    private GroupRepository groupRepository;

    public GroupController(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Group> getAll() {
        return groupRepository.findAll();
    }

//    @RequestMapping(value = "/searchByUser/{userid}", method = RequestMethod.GET)
//    public List<Group> searchByUser(@RequestBody final Integer userid) {
//        return groupRepository.findByUserID(userid);
//    }









}
