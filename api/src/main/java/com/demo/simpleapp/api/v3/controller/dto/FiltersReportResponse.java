package com.demo.simpleapp.api.v3.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FiltersReportResponse {

    private String status;
    private List<Report> reports;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Report{

        private String count;
        private String total;
        private String currency;

    }

}

