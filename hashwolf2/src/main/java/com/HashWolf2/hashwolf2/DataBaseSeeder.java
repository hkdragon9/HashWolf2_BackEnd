package com.HashWolf2.hashwolf2;

import com.HashWolf2.hashwolf2.Model.User;
import com.HashWolf2.hashwolf2.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class DataBaseSeeder implements CommandLineRunner {

    private UserRepository userRepository;

    @Autowired
    public DataBaseSeeder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String ... strings) throws Exception {


        // List<User> list = new ArrayList<>();

        // list.add(new User(10, "Kenny", "kennyhuang9@qq.com"));
        // list.add(new User(20, "Zichuan", "zeichuan@berkeley.edu"));

        // userRepository.saveAll(list);

    }
}
