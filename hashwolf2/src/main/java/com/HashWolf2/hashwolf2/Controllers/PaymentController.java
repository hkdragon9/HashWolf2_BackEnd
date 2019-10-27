package com.HashWolf2.hashwolf2.Controllers;

import com.HashWolf2.hashwolf2.Model.Payment;
import com.HashWolf2.hashwolf2.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/payment")
public class PaymentController {
    private static PaymentController ourInstance = new PaymentController();

    public static PaymentController getInstance() {
        return ourInstance;
    }

    private PaymentController() {
    }


    @Autowired
    private PaymentRepository paymentRepository;

    public PaymentController(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public PaymentRepository getPaymentRepository() {
        return paymentRepository;
    }

    @RequestMapping(value = "/all")
    public List<Payment> getAll() {
        return paymentRepository.findAll();
    }

    @RequestMapping(value = "/clear")
    public List<Payment> clear(){
        paymentRepository.deleteAll();
        return paymentRepository.findAll();

    }



}
