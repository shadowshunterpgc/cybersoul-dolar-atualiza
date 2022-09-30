package com.cybersoul.dolaratualiza.usecase;

import com.cybersoul.dolaratualiza.domain.Currency;
import com.cybersoul.dolaratualiza.gateway.h2.H2Gateway;
import com.cybersoul.dolaratualiza.gateway.kafka.KafkaGateway;
import com.cybersoul.dolaratualiza.gateway.mysql.MysqlGateway;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.gson.Gson;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class DolarUCTest {
	
	private String url = "https://economia.awesomeapi.com.br";
	H2Gateway h2Gateway = new H2Gateway();
	MysqlGateway mysqlGateway = new MysqlGateway();
	KafkaGateway kafkaGateway = new KafkaGateway();
	
	public Currency[] consultaDolar() {

		Gson gson = new Gson();
		RestTemplate rt = new RestTemplate();
		String json = rt.getForObject(url + "/USD-BRL/1", String.class);
		Currency[] dolar = gson.fromJson(json, Currency[].class);
		return dolar;
	}
	
	@Test
	public void consultaDolarTest() throws JsonMappingException, JsonProcessingException {

		Currency[] dolar = consultaDolar();
		assertEquals(dolar[0].getCode() + "-" + dolar[0].getCodein(),"USD-BRL");
	}
	
	@Test
	public void consultaDolarGravaH2() throws JsonMappingException, JsonProcessingException {

		Currency[] dolar = consultaDolar();
		List<Currency> listDolar = new ArrayList<>();
		
		for (int i=0; i < dolar.length; i++) {
			listDolar.add(dolar[i]);
		}
		assertNotNull(listDolar);
	}
	
	@Test
	public void consultaDolarGravaMysql() throws JsonMappingException, JsonProcessingException {

		Currency[] dolar = consultaDolar();
		List<Currency> listDolar = new ArrayList<>();
		
		for (int i=0; i < dolar.length; i++) {
			listDolar.add(dolar[i]);
		}
		assertNotNull(mysqlGateway.execute(listDolar));
	}
}
