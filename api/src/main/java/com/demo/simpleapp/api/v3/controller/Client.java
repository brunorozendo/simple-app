package com.demo.simpleapp.api.v3.controller;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping(path = "/api/v3")
public interface Client {
    @GetMapping(value = "/client", produces = "application/json")
    String hello(@Valid @PathVariable Integer value);

}
