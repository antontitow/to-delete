package com.example.demo.controller;

import com.example.demo.config.IntDtoConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
@RequiredArgsConstructor
public class HibernateController {
    private final IntDtoConfig intDtoConfig;

//    private final Map<String, InDto> map;
//    private final HibernateService hibernateService;
//    private final TransactService transactService;

//    @PostMapping("operation")
//    public OperationEntity createOperatinon(@RequestBody RequestOperationDto requestOperationDto) {
//        return hibernateService.createOperation(requestOperationDto.typeOperation());
//    }

//    @PostMapping("create/pair")
//    public Result checkTransactionals() {
//        try {
//            transactService.createPairOperation();
//            return new Result("OK");
//        } catch (Exception e) {
//            return new Result("BAD");
//        }
//    }

    @GetMapping("int-dto/all")
    public String getIntDto() {
        intDtoConfig.inDtoMap().entrySet().stream().forEach(k -> System.out.println(k.getKey() + "//" + k.getValue()));
        return "234";
    }
}
