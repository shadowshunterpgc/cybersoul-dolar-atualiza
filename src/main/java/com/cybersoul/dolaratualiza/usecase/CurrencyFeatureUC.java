package com.cybersoul.dolaratualiza.usecase;

import java.util.List;

import com.cybersoul.dolaratualiza.domain.Currency;
import com.cybersoul.dolaratualiza.gateway.api.CurrencyApiExternal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybersoul.dolaratualiza.gateway.h2.H2Gateway;

@Service
public class CurrencyFeatureUC implements CurrencyFeature {

	@Autowired
	private H2Gateway h2Gateway;

	@Autowired
	private CurrencyApiExternal dolarApiExternal;
	
	public List<Currency> execute(String moeda, Integer quantidade) {

		Currency dolar = new Currency();
		List<Currency> listDolar = dolarApiExternal.getDolarList(moeda, quantidade);
		h2Gateway.execute(dolar.getDolarList(listDolar));
		return listDolar;
	}
}
