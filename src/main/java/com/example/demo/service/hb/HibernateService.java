package com.example.demo.service.hb;

import com.example.demo.domain.OperationEntity;

public interface HibernateService {
    OperationEntity createOperation(String typeOperation);

}
