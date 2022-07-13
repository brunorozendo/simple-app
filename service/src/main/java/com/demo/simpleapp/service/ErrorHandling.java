package com.demo.simpleapp.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ErrorHandling {

    @ExceptionHandler(value = Throwable.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)

    public String resourceNotFoundException(Throwable ex, WebRequest request) {
        return "{ \"status\": \""+ex.getMessage()+"\"}";
    }
}