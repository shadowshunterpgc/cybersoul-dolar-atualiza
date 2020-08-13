package com.cybersoul.dolaratualiza.mock;


import com.cybersoul.dolaratualiza.entity.DolarEntity;

import java.util.UUID;

public class MockDolar {
    public
    DolarEntity entity = DolarEntity.builder()
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
