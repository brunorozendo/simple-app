package com.demo.simpleapp.business;

import com.demo.simpleapp.api.v3.dao.ClientDAO;
import com.demo.simpleapp.api.v3.controller.dto.ClientRequest;
import com.demo.simpleapp.api.v3.controller.dto.ClientResponse;
import com.demo.simpleapp.api.v3.dao.models.Client;
import com.demo.simpleapp.api.v3.mapper.ClientMapper;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class ClientBO {


    private final ClientDAO service;
    private final ClientMapper mapper;

    public ClientResponse getClient(ClientRequest clientRequest) {
        //TODO get id from the request
        // clientRequest.getTransactionId()
        Client client = service.findById(1L);

        return mapper.convert(client);
    }
}
