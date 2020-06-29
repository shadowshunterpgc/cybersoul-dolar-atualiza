package com.cybersoul.dolaratualiza.gateway.mysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybersoul.dolaratualiza.domain.Dolar;

@Repository
public interface MysqlRepository extends JpaRepository<Dolar, Long> {

}