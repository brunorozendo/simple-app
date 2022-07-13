package com.demo.simpleapp.api.v3.controller.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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