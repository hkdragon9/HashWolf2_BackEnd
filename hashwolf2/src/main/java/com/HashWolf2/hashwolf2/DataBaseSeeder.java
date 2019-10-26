package com.HashWolf2.hashwolf2;

import com.HashWolf2.hashwolf2.Model.GroupTable;
import com.HashWolf2.hashwolf2.Model.Payment;
import com.HashWolf2.hashwolf2.Model.User;
import com.HashWolf2.hashwolf2.Repository.GroupTableRepository;
import com.HashWolf2.hashwolf2.Repository.PaymentRepository;
import com.HashWolf2.hashwolf2.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class DataBaseSeeder implements CommandLineRunner {

    private UserRepository userRepository;
    private GroupTableRepository groupTableRepository;
    private PaymentRepository paymentRepository;

    @Autowired
    public DataBaseSeeder(UserRepository userRepository, GroupTableRepository groupTableRepository, PaymentRepository paymentRepository) {
        this.userRepository = userRepository;
        this.groupTableRepository = groupTableRepository;
        this.paymentRepository = paymentRepository;
    }

    @Override
    public void run(String ... strings) throws Exception {

        //reset
        userRepository.deleteAll();
        groupTableRepository.deleteAll();
        paymentRepository.deleteAll();

        //list set up
        List<User> userList = new ArrayList<>();
        List<GroupTable> groupList = new ArrayList<>();
        List<Payment> paymentList = new ArrayList<>();


        //random data

        User ThatMan = new User("LaoLiu", "ZeiChuan@qq.com", null);

        Payment pay1 = new Payment("Xi Dian");
        Payment pay2 = new Payment("BSC");

        paymentList.add(pay1);
        paymentList.add(pay2);

        GroupTable ZC = new GroupTable("Cool", null, paymentList);



        userList.add(new User("Test", "Test@qq.com", null));
        userList.add(new User("TestTest", "TestTest@berkeley.edu", null));
        userList.add(ThatMan);
        userRepository.saveAll(userList);


        paymentList.add(new Payment("lunch"));
        paymentRepository.saveAll(paymentList);

         groupList.add(ZC);
         groupList.add(new GroupTable("Calhacks", null, null));
         groupTableRepository.saveAll(groupList);




    }
}
