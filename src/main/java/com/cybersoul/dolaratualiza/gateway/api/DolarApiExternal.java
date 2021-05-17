package com.cybersoul.dolaratualiza.gateway.api;


import com.cybersoul.dolaratualiza.domain.Dolar;
import com.google.gson.Gson;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
public class DolarApiExternal {

    private final String url = "https://economia.awesomeapi.com.br";

    public List<Dolar> getDolarList(String moeda, Integer quantidade) {

        RestTemplate rt = new RestTemplate();
        Gson gson = new Gson();
        String json = rt.getForObject(url + "/" + moeda + "/" + quantidade, String.class);
        List<Dolar> listDolar = new ArrayList<>();
        Dolar[] dolar = gson.fromJson(json, Dolar[].class);

        for (int i = 0; i < dolar.length; i++) {
            listDolar.add(dolar[i]);
        }
        return listDolar;
    }
}