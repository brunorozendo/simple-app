package com.demo.simpleapp.api.v3.controller.dto;

import lombok.*;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {

    @NotNull
    @Size(max = 128)
    @Email
    private String email;
    @NotNull
    @Size(max = 32)
    private String password;

}