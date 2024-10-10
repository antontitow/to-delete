package com.example.demo.util;

import com.example.demo.domain.OperationEntity;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

@Component
@RequiredArgsConstructor
@Slf4j
@Data
public class OperationUtil {
    private final List<OperationEntity> operations;
    private Map<String, OperationEntity> operationsMap;

//    @PostConstruct
//    public void groupOperations() {
//        operationsMap = operations.stream()
//                .collect(toMap(OperationEntity::getType, Function.identity()));
////                .collect(groupingBy(OperationEntity::getType));
//        log.info(operationsMap.toString());
//    }

}
