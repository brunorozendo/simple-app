package com.demo.simpleapp.api.v3.controller;

import com.demo.simpleapp.api.v3.controller.dto.FiltersReportRequest;
import com.demo.simpleapp.api.v3.controller.dto.FiltersReportResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@RequestMapping("/api/v3")
public interface Transaction {

    @PostMapping(value = "/transactions/report", consumes = "application/json", produces = "application/json")
    FiltersReportResponse getReport(@Valid @RequestBody FiltersReportRequest filtersReport);
}
