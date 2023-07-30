package com.jwt.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //Database not used in this project so creating fake service to fetch username password and get authorities list
        if(username.equals("Akash")){

            return new User("Akash", "abc", new ArrayList<>());
        }else {
            throw new UsernameNotFoundException("User not found !!!");
        }

    }
}
