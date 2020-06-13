package com.cybersoul.dolaratualiza.gateway.kafka;

import java.util.List;

import com.cybersoul.dolaratualiza.domain.Dolar;
import com.cybersoul.dolaratualiza.usecase.DolarFeature;

public class KafkaGateway implements DolarFeature {

	@Override
	public List<Dolar> saveAll(List<Dolar> listDolar) {
		System.out.println("Saving in Kafka: " + listDolar);
		return listDolar;
	}
}
