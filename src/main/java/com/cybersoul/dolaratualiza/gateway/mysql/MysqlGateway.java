package com.cybersoul.dolaratualiza.gateway.mysql;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.cybersoul.dolaratualiza.domain.Dolar;

@Component
public class MysqlGateway {

	public List<Dolar> execute(List<Dolar> listDolar) {
		listDolar.get(0).setId(UUID.randomUUID());
		System.out.println("Saving in MySQL: " + listDolar);
		return listDolar;
	}
}
