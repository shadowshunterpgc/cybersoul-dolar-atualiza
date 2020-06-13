package com.cybersoul.dolaratualiza.usecase;

import java.util.List;

import com.cybersoul.dolaratualiza.domain.Dolar;
import com.cybersoul.dolaratualiza.gateway.kafka.KafkaGateway;
import com.cybersoul.dolaratualiza.gateway.mysql.MysqlGateway;

public class DolarFeatureUC {

	private KafkaGateway kafkaGateway;	
	private MysqlGateway mysqlGateway;

	public List<Dolar> execute(List<Dolar> listDolar) {
		kafkaGateway = new KafkaGateway();
		mysqlGateway = new MysqlGateway();
		
		kafkaGateway.saveAll(listDolar);
		mysqlGateway.saveAll(listDolar);
		return listDolar;
	}
}
