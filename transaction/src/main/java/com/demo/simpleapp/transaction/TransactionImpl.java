package com.demo.simpleapp.transaction;

import com.demo.simpleapp.api.v3.controller.Transaction;
import com.demo.simpleapp.api.v3.controller.dto.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionImpl implements Transaction {
    @Override
    public ReportResponse getReport(ReportRequest filtersReport) {
        return new ReportResponse();
    }

    @Override
    public ListResponse getList(ListRequest request) {
        return new ListResponse();
    }

    @Override
    public TransactionResponse getTransaction(TransactionResquest request) {
        return new TransactionResponse();
    }


}
