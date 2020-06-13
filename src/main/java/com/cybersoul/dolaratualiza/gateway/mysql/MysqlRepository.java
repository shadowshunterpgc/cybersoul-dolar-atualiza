package com.cybersoul.dolaratualiza.gateway.mysql;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cybersoul.dolaratualiza.domain.Dolar;

public interface MysqlRepository extends JpaRepository<Dolar, Long> {

}
