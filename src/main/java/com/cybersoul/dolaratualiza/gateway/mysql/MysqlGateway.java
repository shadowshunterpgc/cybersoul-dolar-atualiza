package com.cybersoul.dolaratualiza.gateway.mysql;

import java.util.List;
import java.util.UUID;

import com.cybersoul.dolaratualiza.domain.Currency;
import org.springframework.stereotype.Component;

@Component
public class MysqlGateway {

	public List<Currency> execute(List<Currency> listDolar) {
		listDolar.get(0).setId(UUID.randomUUID());
		System.out.println("Saving in MySQL: " + listDolar);
		return listDolar;
	}
}
