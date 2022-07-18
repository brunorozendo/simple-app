package com.demo.simpleapp.api.v3.controller;

import com.demo.simpleapp.api.v3.controller.dto.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@RequestMapping("/api/v3")
public interface TransactionController {

    @PostMapping(value = "/transactions/report", consumes = "application/json", produces = "application/json")
    ReportResponse getReport(@Valid @RequestBody ReportRequest request);

    @PostMapping(value = "/transactions/list", consumes = "application/json", produces = "application/json")
    ListResponse getList(@Valid @RequestBody ListRequest request);

    @PostMapping(value = "/transaction", consumes = "application/json", produces = "application/json")
    TransactionResponse getTransaction(@Valid @RequestBody TransactionResquest request);
}
