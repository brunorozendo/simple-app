package com.demo.simpleapp.business;

import com.demo.simpleapp.api.v3.business.TokenService;
import com.demo.simpleapp.api.v3.controller.dto.LoginRequest;
import com.demo.simpleapp.api.v3.controller.dto.LoginResponse;
import lombok.AllArgsConstructor;


//@Component
@AllArgsConstructor
public class TokenBO {

    private final TokenService tokenService;

    public LoginResponse getToken(LoginRequest credentials){
        tokenService.authenticate(credentials);
        String username = tokenService.getUsername(credentials);
        final String jwtToken = tokenService.generate(username);
        LoginResponse response = new LoginResponse();
        response.setToken(jwtToken);
        response.setStatus("APPROVED");
        return response;
    }


}
