package com.cybersoul.dolaratualiza.gateway.h2;

import java.util.List;

import com.cybersoul.dolaratualiza.domain.Dolar;
import com.cybersoul.dolaratualiza.usecase.DolarFeature;

public class H2Gateway implements DolarFeature {

	@Override
	public List<Dolar> saveAll(List<Dolar> listDolar) {
		System.out.println("Saving H2: " + listDolar);
		return listDolar;
	}
}
