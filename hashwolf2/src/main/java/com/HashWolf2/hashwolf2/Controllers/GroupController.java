package com.HashWolf2.hashwolf2.Controllers;

import com.HashWolf2.hashwolf2.Model.GroupTable;
import com.HashWolf2.hashwolf2.Repository.GroupTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/groupTable")
public class GroupController {


    @Autowired
    private GroupTableRepository groupTableRepository;

    public GroupController(GroupTableRepository groupTableRepository) {
        this.groupTableRepository = groupTableRepository;
    }

    public GroupTableRepository getGroupTableRepository() {
        return groupTableRepository;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<GroupTable> getAll() {
        return groupTableRepository.findAll();
    }

    @RequestMapping(value = "/clear")
    public List<GroupTable> clear(){
        groupTableRepository.deleteAll();
        return groupTableRepository.findAll();

    }

//    @RequestMapping(value = "/searchByUser/{userid}", method = RequestMethod.GET)
//    public List<Group> searchByUser(@RequestBody final Integer userid) {
//        return groupTableRepository.findByUserID(userid);
//    }









}
