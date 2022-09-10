package com.cybersoul.dolaratualiza.gateway.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/currency")
public class CurrencyOfDayController {

    private String url = "http://localhost:8080/currency/converte";

    @GetMapping("/everything")
    public void putCurrencies() {

        String[] currencies = {"USD-BRL", "EUR-BRL", "GBP-BRL", "CAD-BRL", "AUD-BRL", "CNY-BRL", "TWD-BRL",
                "NOK-BRL", "PYG-BRL", "BTC-BRL"};

        RestTemplate rt = new RestTemplate();
        for (int i=0; i < currencies.length; i++) {
            rt.getForObject(url + "?moeda=" + currencies[i] + "&quantidade=" + 1, Object.class);
        }
    }
}
