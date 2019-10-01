package com.HashWolf2.hashwolf2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.HashWolf2.hashwolf2.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
