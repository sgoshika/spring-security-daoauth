package com.sgoshika.spring_sec_demo.service;

import com.sgoshika.spring_sec_demo.dao.UserRepo;
import com.sgoshika.spring_sec_demo.model.User;
import com.sgoshika.spring_sec_demo.model.UserDetailsPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=repo.findByusername(username);

        if(user == null){
            System.out.println("Local machine: ----> User Not Found!!!");
            throw new UsernameNotFoundException("User 404 error");
        }

        return new UserDetailsPrincipal(user);
    }
}
