package com.demo.simpleapp.api.v3.business;

import com.demo.simpleapp.api.v3.controller.dto.LoginRequest;

public interface TokenService {
    String generate(String username);

    String getUsername(LoginRequest credentials);

    void authenticate(LoginRequest credentials) ;

}
