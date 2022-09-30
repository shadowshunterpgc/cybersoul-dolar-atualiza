package com.cybersoul.dolaratualiza.usecase;

import java.util.List;

import com.cybersoul.dolaratualiza.domain.Currency;
import com.cybersoul.dolaratualiza.entity.CurrencyEntity;

public interface CurrencyFeature {
	List<Currency> execute(String moeda, Integer quantidade);
}
