package com.cybersoul.dolaratualiza.gateway.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cybersoul.dolaratualiza.domain.Dolar;
import com.cybersoul.dolaratualiza.usecase.DolarFeatureUC;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.gson.Gson;

@RestController
@RequestMapping("/dolar")
public class DolarController {	
	
	private final String url = "https://economia.awesomeapi.com.br";
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/converte")
	public ResponseEntity<HttpStatus> consultaDolar(
			@RequestParam("moeda") String moeda, 
			@RequestParam("quantidade") Integer quantidade) throws JsonMappingException, JsonProcessingException {
	
		DolarFeatureUC dolarFeatureUc = new DolarFeatureUC();
		RestTemplate rt = new RestTemplate();
		Gson gson = new Gson();
		String json = rt.getForObject(url + "/" + moeda + "/" + quantidade, String.class);
		List<Dolar> listDolar = new ArrayList<>();
		Dolar[] dolar = gson.fromJson(json, Dolar[].class);
		
		for (int i=0; i < dolar.length; i++) {
			listDolar.add(dolar[i]);
		}	

		dolarFeatureUc.execute(listDolar);
		
		return ResponseEntity.ok(HttpStatus.OK);
	}
}
