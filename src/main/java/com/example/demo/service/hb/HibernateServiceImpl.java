package com.example.demo.service.hb;

import com.example.demo.domain.CreditOperationEntity;
import com.example.demo.domain.DebitOperationEntity;
import com.example.demo.domain.OperationEntity;
//import com.example.demo.dto.map.InDto;
//import com.example.demo.repo.OperationRepository;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.time.OffsetDateTime;
//import java.util.Map;
//import java.util.UUID;

//@Slf4j
//@Service
//@RequiredArgsConstructor
public class HibernateServiceImpl /*implements HibernateService */{
/*private final Map<String, InDto> map;
    private final OperationRepository operationRepository;*/
//
//    @Override
//    @Transactional(propagation = Propagation.NOT_SUPPORTED)
//    public OperationEntity createOperation(String typeOperation) {
//        log.info(String.format("Doing %s operation", typeOperation));
//        return operationRepository.save(createEntity(typeOperation));
//    }


//    OperationEntity createEntity(String typeOperatio) {
//        log.info(typeOperatio);
//        switch (typeOperatio) {
//            case "credit":
//                return CreditOperationEntity
//                        .builder()
//                        .id(UUID.randomUUID())
//                        .status(OperationEntity.Status.CREATE)
//                        .createAt(OffsetDateTime.now())
//                        .isTax(false)
//                        .build();
//            case "debit":
//                return DebitOperationEntity
//                        .builder()
//                        .id(UUID.randomUUID())
//                        .status(OperationEntity.Status.CREATE)
//                        .createAt(OffsetDateTime.now())
//                        .comission(0)
//                        .build();
//            default:
//                throw new RuntimeException("no type operation");
//        }
//    }
}
