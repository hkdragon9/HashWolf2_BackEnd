package com.HashWolf2.hashwolf2.Repository;

import com.HashWolf2.hashwolf2.Model.Group;
import com.HashWolf2.hashwolf2.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GroupRepository extends JpaRepository<Group, Integer> {

//    @Query("SELECT g FROM Group g WHERE userid IN g.users")
//    List<Group> findByUserID(Integer userid);
}
