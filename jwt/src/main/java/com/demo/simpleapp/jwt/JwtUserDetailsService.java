package com.demo.simpleapp.jwt;

import com.demo.simpleapp.api.v3.dao.UserDAO;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class JwtUserDetailsService implements UserDetailsService {

    private final UserDAO userDAO;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var user = userDAO.findByEmail(username);
        if(user != null){
            return new User(user.getEmail(), user.getPassword(), new ArrayList<>());
        }else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }

    }
}