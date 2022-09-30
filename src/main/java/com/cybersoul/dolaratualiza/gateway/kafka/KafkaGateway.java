package com.cybersoul.dolaratualiza.gateway.kafka;

import java.util.List;

import com.cybersoul.dolaratualiza.domain.Currency;
import com.cybersoul.dolaratualiza.gateway.api.CurrencyApiExternal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cybersoul.dolaratualiza.usecase.CurrencyFeature;

@Component
public class KafkaGateway implements CurrencyFeature {

	@Autowired
	private CurrencyApiExternal dolarApiExternal;

	@Override
	public List<Currency> execute(String moeda, Integer quantidade) {
		return dolarApiExternal.getDolarList(moeda, quantidade);
	}
}
