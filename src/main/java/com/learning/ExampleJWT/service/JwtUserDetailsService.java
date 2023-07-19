package com.learning.ExampleJWT.service;

import com.learning.ExampleJWT.entity.UserAPIAccess;
import com.learning.ExampleJWT.repository.UserAPIAccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserAPIAccessRepository userAPIAccessRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserAPIAccess user = userAPIAccessRepository.findByUserName(username);
        if (user != null) {
            return new User(user.getUserName(), user.getPassword(), new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}
