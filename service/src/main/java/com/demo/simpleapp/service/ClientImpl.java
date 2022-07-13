package com.demo.simpleapp.service;

import com.demo.simpleapp.api.v3.controller.Client;
import com.demo.simpleapp.api.v3.controller.dto.ClientRequest;
import com.demo.simpleapp.api.v3.controller.dto.ClientResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientImpl implements Client {

    @Override
    public ClientResponse getClient(ClientRequest clientRequest) {
        return null;
    }
}