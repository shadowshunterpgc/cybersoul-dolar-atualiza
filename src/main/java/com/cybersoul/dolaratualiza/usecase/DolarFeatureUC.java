package com.cybersoul.dolaratualiza.usecase;

import java.util.List;

import com.cybersoul.dolaratualiza.gateway.api.DolarApiExternal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybersoul.dolaratualiza.domain.Dolar;
import com.cybersoul.dolaratualiza.gateway.h2.H2Gateway;

@Service
public class DolarFeatureUC implements DolarFeature {

	@Autowired
	private H2Gateway h2Gateway;

	@Autowired
	private DolarApiExternal dolarApiExternal;
	
	public List<Dolar> execute(String moeda, Integer quantidade) {

		return h2Gateway.execute(dolarApiExternal.getDolarList(moeda, quantidade));
	}
}
