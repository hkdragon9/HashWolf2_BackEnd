package com.HashWolf2.hashwolf2.Repository;

import com.HashWolf2.hashwolf2.Model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
