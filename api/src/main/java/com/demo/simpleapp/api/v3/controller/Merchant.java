package com.demo.simpleapp.api.v3.controller;


import com.demo.simpleapp.api.v3.controller.dto.LoginRequest;
import com.demo.simpleapp.api.v3.controller.dto.LoginResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@RequestMapping("/api/v3/merchant")
public interface Merchant {

    @PostMapping(value = "/user/login", consumes = "application/json", produces = "application/json" )
    LoginResponse getCredentials(@Valid @RequestBody LoginRequest credentials);
}
