package com.cybersoul.dolaratualiza.gateway.mysql;

import java.util.List;

import com.cybersoul.dolaratualiza.domain.Dolar;
import com.cybersoul.dolaratualiza.usecase.DolarFeature;

public class MysqlGateway implements DolarFeature {
	
	@Override
	public List<Dolar> saveAll(List<Dolar> listDolar) {
		System.out.println("Saving in MySQL: " + listDolar);
		return listDolar;
	}
}
