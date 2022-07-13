package com.demo.simpleapp.service;

import com.demo.simpleapp.api.v3.controller.Client;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientImpl implements Client {

    public String hello(Integer value) {
        return "{ \"A\": " + value + "}";
    }
}