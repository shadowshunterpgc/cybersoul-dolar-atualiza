package com.cybersoul.dolaratualiza.gateway.h2;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybersoul.dolaratualiza.domain.Dolar;

@Service
public class H2Gateway {
	
	@Autowired
	private H2Repository h2Repository;

	public List<Dolar> execute(List<Dolar> listDolar) {
		listDolar.get(0).setId(UUID.randomUUID());
		h2Repository.saveAll(listDolar);
		System.out.println("Saving in MySQL: " + listDolar);
		return listDolar;
	}
}
