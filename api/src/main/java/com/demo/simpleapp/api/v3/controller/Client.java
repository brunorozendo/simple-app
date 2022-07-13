package com.demo.simpleapp.api.v3.controller;

import com.demo.simpleapp.api.v3.controller.dto.ClientRequest;
import com.demo.simpleapp.api.v3.controller.dto.ClientResponse;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping(path = "/api/v3")
public interface Client {
    @GetMapping(value = "/client", produces = "application/json")
    ClientResponse getClient(@Valid ClientRequest clientRequest);

}
