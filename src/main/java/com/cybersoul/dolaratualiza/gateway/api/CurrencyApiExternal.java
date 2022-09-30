package com.cybersoul.dolaratualiza.gateway.api;


import com.cybersoul.dolaratualiza.domain.Currency;
import com.google.gson.Gson;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
public class CurrencyApiExternal {

    private final String url = "https://economia.awesomeapi.com.br";

    public List<Currency> getDolarList(String moeda, Integer quantidade) {

        RestTemplate rt = new RestTemplate();
        Gson gson = new Gson();
        String json = rt.getForObject(url + "/" + moeda + "/" + quantidade, String.class);
        List<Currency> listDolar = new ArrayList<>();
        Currency[] dolar = gson.fromJson(json, Currency[].class);

        for (int i = 0; i < dolar.length; i++) {
            listDolar.add(dolar[i]);
        }
        return listDolar;
    }
}