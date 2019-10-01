package com.HashWolf2.hashwolf2.Controllers;


import com.HashWolf2.hashwolf2.Model.User;
import com.HashWolf2.hashwolf2.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/hashwolf2")
public class UserController {

    @Autowired
    private UserRepository usersRepository;

    public UserController(UserRepository userRepository){
        this.usersRepository = userRepository;
    }

    @RequestMapping(value = "/all")
    public List<User> getAll(){
        return usersRepository.findAll();
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public List<User> add(@RequestBody final User user) {
        usersRepository.save(user);
        return usersRepository.findAll();
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public List<User> insert(@RequestParam int user_userID, @RequestParam String user_name, @RequestParam String user_email) {
        User tempUser = new User(user_userID, user_name, user_email);
        usersRepository.save(tempUser);
        return usersRepository.findAll();
    }

}
