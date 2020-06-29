package com.cybersoul.dolaratualiza.usecase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybersoul.dolaratualiza.domain.Dolar;
import com.cybersoul.dolaratualiza.gateway.h2.H2Gateway;

@Service
public class DolarFeatureUC implements DolarFeature {

	@Autowired
	private H2Gateway h2Gateway;
	
	public List<Dolar> execute(List<Dolar> listDolar) {
		h2Gateway.execute(listDolar);
		return listDolar;
	}
}
