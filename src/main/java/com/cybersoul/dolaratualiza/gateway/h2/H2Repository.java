package com.cybersoul.dolaratualiza.gateway.h2;

import com.cybersoul.dolaratualiza.entity.DolarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybersoul.dolaratualiza.domain.Dolar;

@Repository
public interface H2Repository extends JpaRepository<DolarEntity, Long> {

}
