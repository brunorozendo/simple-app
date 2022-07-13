package com.demo.simpleapp.transaction;

import com.demo.simpleapp.api.v3.controller.Transaction;
import com.demo.simpleapp.api.v3.controller.dto.FiltersReportRequest;
import com.demo.simpleapp.api.v3.controller.dto.FiltersReportResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionImpl implements Transaction {
    @Override
    public FiltersReportResponse getReport(FiltersReportRequest filtersReport) {
        return new FiltersReportResponse();
    }
}
