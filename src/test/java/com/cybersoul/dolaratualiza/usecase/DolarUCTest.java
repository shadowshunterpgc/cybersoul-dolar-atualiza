package com.cybersoul.dolaratualiza.usecase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import com.cybersoul.dolaratualiza.domain.Dolar;
import com.cybersoul.dolaratualiza.gateway.h2.H2Gateway;
import com.cybersoul.dolaratualiza.gateway.kafka.KafkaGateway;
import com.cybersoul.dolaratualiza.gateway.mysql.MysqlGateway;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.gson.Gson;


public class DolarUCTest {
	
	private String url = "https://economia.awesomeapi.com.br";
	H2Gateway h2Gateway = new H2Gateway();
	MysqlGateway mysqlGateway = new MysqlGateway();
	KafkaGateway kafkaGateway = new KafkaGateway();
	
	public Dolar[] consultaDolar() {
		Gson gson = new Gson();
		RestTemplate rt = new RestTemplate();
		String json = rt.getForObject(url + "/USD-BRL/1", String.class);
		Dolar[] dolar = gson.fromJson(json, Dolar[].class);
		return dolar;
	}
	
	@Test
	public void consultaDolarTest() throws JsonMappingException, JsonProcessingException {
		Dolar[] dolar = consultaDolar();
		assertEquals(dolar[0].getCode() + "-" + dolar[0].getCodein(),"USD-BRL");
	}
	
	@Test
	public void consultaDolarGravaH2() throws JsonMappingException, JsonProcessingException {
		Dolar[] dolar = consultaDolar();
		List<Dolar> listDolar = new ArrayList<>();
		
		for (int i=0; i < dolar.length; i++) {
			listDolar.add(dolar[i]);
		}
		assertNotNull(h2Gateway.execute(listDolar));
	}
	
	@Test
	public void consultaDolarGravaMysql() throws JsonMappingException, JsonProcessingException {
		Dolar[] dolar = consultaDolar();
		List<Dolar> listDolar = new ArrayList<>();
		
		for (int i=0; i < dolar.length; i++) {
			listDolar.add(dolar[i]);
		}
		assertNotNull(mysqlGateway.execute(listDolar));
		
	}
	
	@Test
	public void consultaDolarGravaKafka() throws JsonMappingException, JsonProcessingException {
		Dolar[] dolar = consultaDolar();
		List<Dolar> listDolar = new ArrayList<>();
		
		for (int i=0; i < dolar.length; i++) {
			listDolar.add(dolar[i]);
		}
		assertNotNull(kafkaGateway.execute(listDolar));
	}
}
