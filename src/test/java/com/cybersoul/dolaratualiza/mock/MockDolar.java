package com.cybersoul.dolaratualiza.mock;


import com.cybersoul.dolaratualiza.entity.CurrencyEntity;

import java.util.UUID;

public class MockDolar {
    public
    CurrencyEntity entity = CurrencyEntity.builder()
            .id(UUID.randomUUID())
            .ask("")
            .bid("")
            .code("")
            .codein("")
            .create_date("")
            .high("")
            .low("")
            .name("")
            .pctChange("")
            .timestamp("")
            .varBid("")
            .build();
}
