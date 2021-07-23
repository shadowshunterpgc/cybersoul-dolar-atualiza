package com.cybersoul.dolaratualiza.gateway.h2;

import com.cybersoul.dolaratualiza.entity.DolarEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class H2Gateway {

    @Autowired
    private H2Repository h2Repository;

    private static final Logger LOG = LoggerFactory.getLogger(H2Gateway.class);

    public void execute(DolarEntity entity) {

        if (Objects.nonNull(entity)) {
            h2Repository.save(entity);
            LOG.info("" + entity);
        } else {
            LOG.error("" + entity);
            throw new NullPointerException();
        }
	}
}
