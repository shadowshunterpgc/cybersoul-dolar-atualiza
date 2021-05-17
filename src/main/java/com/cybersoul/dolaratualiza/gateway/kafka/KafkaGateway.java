package com.cybersoul.dolaratualiza.gateway.kafka;

import java.util.List;

import com.cybersoul.dolaratualiza.gateway.api.DolarApiExternal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cybersoul.dolaratualiza.domain.Dolar;
import com.cybersoul.dolaratualiza.usecase.DolarFeature;

@Component
public class KafkaGateway implements DolarFeature {

	@Autowired
	private DolarApiExternal dolarApiExternal;

	@Override
	public List<Dolar> execute(String moeda, Integer quantidade) {
		return dolarApiExternal.getDolarList(moeda, quantidade);
	}
}
