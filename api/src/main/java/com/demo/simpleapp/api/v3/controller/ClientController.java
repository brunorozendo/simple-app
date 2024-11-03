package com.demo.simpleapp.api.v3.controller;

import com.demo.simpleapp.api.v3.controller.dto.ClientRequest;
import com.demo.simpleapp.api.v3.controller.dto.ClientResponse;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RequestMapping(path = "/api/v3")
public interface ClientController {
    @PostMapping(value = "/client", produces = "application/json", consumes = "application/json")
    ClientResponse getClient(@Valid @RequestBody ClientRequest clientRequest);

}
