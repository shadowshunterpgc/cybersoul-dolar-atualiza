package com.cybersoul.dolaratualiza.gateway.rest;

import com.cybersoul.dolaratualiza.domain.Dolar;
import com.cybersoul.dolaratualiza.gateway.api.DolarApiExternal;
import com.cybersoul.dolaratualiza.usecase.DolarFeatureUC;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.gson.Gson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Api(value = "API Rest Convert")
@RestController
@RequestMapping("/currency")
public class DolarController {

    private final String url = "https://economia.awesomeapi.com.br";
    
    @Autowired
    private DolarFeatureUC dolarFeatureUc;

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