package com.demo.simpleapp.business;

import com.demo.simpleapp.api.v3.services.AuthenticationStatus;
import com.demo.simpleapp.api.v3.services.TokenService;
import com.demo.simpleapp.api.v3.controller.dto.LoginRequest;
import com.demo.simpleapp.api.v3.controller.dto.LoginResponse;
import lombok.AllArgsConstructor;


//@Component
@AllArgsConstructor
public class TokenBO {

    private final TokenService tokenService;

    public LoginResponse getToken(LoginRequest credentials){
        var status = tokenService.authenticate(credentials);
        if(status == AuthenticationStatus.VALID){
            String username = tokenService.getUsername(credentials);
            final String token = tokenService.generate(username);
            LoginResponse response = new LoginResponse();
            response.setToken(token);
            response.setStatus("APPROVED");
            return response;
        }
        throw new RuntimeException(status.name());
    }
}
