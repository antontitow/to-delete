package com.example.demo.controller;

import com.example.demo.domain.OperationEntity;
import com.example.demo.dto.RequestOperationDto;
import com.example.demo.dto.Result;
import com.example.demo.service.HibernateService;
import com.example.demo.service.TransactService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
@RequiredArgsConstructor
public class HibernateController {

    private final HibernateService hibernateService;
    private final TransactService transactService;

    @PostMapping("operation")
    public OperationEntity createOperatinon(@RequestBody RequestOperationDto requestOperationDto) {
        return hibernateService.createOperation(requestOperationDto.typeOperation());
    }

    @PostMapping("create/pair")
    public Result checkTransactionals() {
        try {
            transactService.createPairOperation();
            return new Result("OK");
        } catch (Exception e) {
            return new Result("BAD");
        }
    }
}
