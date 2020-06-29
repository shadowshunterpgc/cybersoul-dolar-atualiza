package com.cybersoul.dolaratualiza.gateway.kafka;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cybersoul.dolaratualiza.domain.Dolar;
import com.cybersoul.dolaratualiza.usecase.DolarFeature;

@Component
public class KafkaGateway implements DolarFeature {

	@Override
	public List<Dolar> execute(List<Dolar> listDolar) {
		System.out.println("Saving in Kafka: " + listDolar);
		return listDolar;
	}
}
