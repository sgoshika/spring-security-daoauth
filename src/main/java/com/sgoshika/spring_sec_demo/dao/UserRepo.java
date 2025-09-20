package com.sgoshika.spring_sec_demo.dao;

import com.sgoshika.spring_sec_demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
    User findByusername(String UserName);
}
