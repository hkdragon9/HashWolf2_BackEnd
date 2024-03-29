package com.HashWolf2.hashwolf2.Controllers;


import com.HashWolf2.hashwolf2.Model.GroupTable;
import com.HashWolf2.hashwolf2.Model.User;
import com.HashWolf2.hashwolf2.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserRepository usersRepository;

    public UserController(UserRepository userRepository){
        this.usersRepository = userRepository;
    }

    public UserRepository getUsersRepository() {
        return usersRepository;
    }

    @RequestMapping(value = "/all")
    public List<User> getAll(){
        return usersRepository.findAll();
    }

    @RequestMapping(value = "/clear")
    public List<User> clear(){
        usersRepository.deleteAll();
        return usersRepository.findAll();
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public List<User> add(@RequestBody final User user) {
        usersRepository.save(user);
        return usersRepository.findAll();
    }

    @GetMapping("/findUserByID/{userID}")
    public User getUserbyId(@PathVariable("userID") final Integer uid) {
        return usersRepository.findByUserid(uid);
    }

    @GetMapping("/findUserGroupsByID/{userID}")
    public List<GroupTable> getUserGroups(@PathVariable("userID") final Integer uid) {
        return usersRepository.findByUserid(uid).getGroups();
    }

    @RequestMapping(value = "/addNewUser", method = RequestMethod.GET)
    public List<User> insert(@RequestParam String user_name, @RequestParam String user_email) {
        User tempUser = new User(user_name, user_email, null);
        usersRepository.save(tempUser);
        return usersRepository.findAll();
    }

    @RequestMapping(value = "/containsGroup")
    public void addGroupToUser(@RequestParam int userID, @RequestParam int groupID) {
        User user = usersRepository.findByUserid(userID);
        //GroupTable group = null;


    }





}
