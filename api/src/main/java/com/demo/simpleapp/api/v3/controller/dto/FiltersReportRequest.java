package com.demo.simpleapp.api.v3.controller.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FiltersReportRequest {

    @NotNull
    private LocalDate fromDate;
    @NotNull
    private LocalDate toDate;
    @NotNull
    private String merchant;
    @NotNull
    private String acquirer;


}
