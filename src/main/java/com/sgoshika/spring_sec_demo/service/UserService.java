package com.sgoshika.spring_sec_demo.service;

import com.sgoshika.spring_sec_demo.dao.UserRepo;
import com.sgoshika.spring_sec_demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;

    private BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder(12);

    public User saveUser(User user){
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        System.out.println(user.getUsername());

        return  repo.save(user);
    }
}
