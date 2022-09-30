package com.cybersoul.dolaratualiza.gateway.rest;

import com.cybersoul.dolaratualiza.usecase.CurrencyFeatureUC;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(value = "API Rest Convert")
@RestController
@RequestMapping("/currency")
public class CurrencyController {

    private final String url = "https://economia.awesomeapi.com.br";
    
    @Autowired
    private CurrencyFeatureUC dolarFeatureUc;

    @ApiOperation(value = "Return a dolar list")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/converte")
    public ResponseEntity<HttpStatus> consultaDolar(
            @RequestParam("moeda") String moeda,
            @RequestParam("quantidade") Integer quantidade) throws JsonMappingException, JsonProcessingException {

        dolarFeatureUc.execute(moeda, quantidade);

        return ResponseEntity.ok(HttpStatus.OK);
    }
}