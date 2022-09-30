package com.cybersoul.dolaratualiza.gateway.h2;

import com.cybersoul.dolaratualiza.entity.CurrencyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class H2Gateway {

    @Autowired
    private H2Repository h2Repository;

    public void execute(CurrencyEntity entity) {

        if (Objects.nonNull(entity)) {
            h2Repository.save(entity);
        } else {
            throw new NullPointerException();
        }
	}
}
