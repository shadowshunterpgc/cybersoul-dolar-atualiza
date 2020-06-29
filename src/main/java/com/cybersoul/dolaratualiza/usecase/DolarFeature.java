package com.cybersoul.dolaratualiza.usecase;

import java.util.List;

import com.cybersoul.dolaratualiza.domain.Dolar;

public interface DolarFeature {
	List<Dolar> execute(List<Dolar> listDolar);
}
