package com.demo.simpleapp.jwt;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("demo@financialhouse.io".equals(username)) {
            return new User(
                    "demo@financialhouse.io",
                    "$2a$10$Ft20nNuEfitGiVZfATYX7OpDaJzt6eVzIsRDGlsVsuiBCtcHT48vW",
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}