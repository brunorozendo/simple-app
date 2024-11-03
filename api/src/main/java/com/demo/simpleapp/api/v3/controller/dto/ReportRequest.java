package com.demo.simpleapp.api.v3.controller.dto;

import lombok.*;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReportRequest {

    @NotNull
    private LocalDate fromDate;
    @NotNull
    private LocalDate toDate;
    @NotNull
    private String merchant;
    @NotNull
    private String acquirer;


}
