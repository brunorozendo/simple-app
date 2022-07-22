package com.demo.simpleapp.api.v3.services;

import com.demo.simpleapp.api.v3.controller.dto.LoginRequest;

public interface TokenService {
    String generate(String username);

    String getUsername(LoginRequest credentials);

    AuthenticationStatus authenticate(LoginRequest credentials) ;

}
