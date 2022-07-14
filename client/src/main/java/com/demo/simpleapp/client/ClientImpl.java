package com.demo.simpleapp.client;

import com.demo.simpleapp.api.v3.controller.Client;
import com.demo.simpleapp.api.v3.controller.dto.ClientRequest;
import com.demo.simpleapp.api.v3.controller.dto.ClientResponse;
import com.demo.simpleapp.business.ClientBO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ClientImpl implements Client {

    private final ClientBO bo;

    @Override
    public ClientResponse getClient(ClientRequest clientRequest) {
        return bo.getClient(clientRequest);
    }
}