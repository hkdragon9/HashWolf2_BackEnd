package com.HashWolf2.hashwolf2.Repository;

import com.HashWolf2.hashwolf2.Model.GroupTable;
import com.HashWolf2.hashwolf2.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GroupTableRepository extends JpaRepository<GroupTable, Integer> {

//    @Query("SELECT g FROM Group g WHERE userid IN g.users")
//    List<Group> findByUserID(Integer userid);
}
