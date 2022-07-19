package com.demo.simpleapp.jwt;

import com.demo.simpleapp.api.v3.controller.MerchantController;
import com.demo.simpleapp.api.v3.controller.dto.LoginRequest;
import com.demo.simpleapp.api.v3.controller.dto.LoginResponse;
import com.demo.simpleapp.business.TokenBO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@CrossOrigin
public class JwtController implements MerchantController {

    private final TokenBO bo;

    @Override
    public LoginResponse getCredentials(LoginRequest credentials) {
        return bo.getToken(credentials);
    }


}