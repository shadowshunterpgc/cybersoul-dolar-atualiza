package com.cybersoul.dolaratualiza.usecase;

import java.util.List;

import com.cybersoul.dolaratualiza.domain.Dolar;
import com.cybersoul.dolaratualiza.entity.DolarEntity;

public interface DolarFeature {
	List<Dolar> execute(String moeda, Integer quantidade);
}
