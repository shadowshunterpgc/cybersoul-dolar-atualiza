package com.cybersoul.dolaratualiza.gateway.h2;

import com.cybersoul.dolaratualiza.domain.Dolar;
import com.cybersoul.dolaratualiza.entity.DolarEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Component
public class H2Gateway {
	
	@Autowired
	H2Repository h2Repository;

	public List<Dolar> execute(List<Dolar> listDolar) {
		listDolar.get(0).setId(UUID.randomUUID());
		DolarEntity entity = DolarEntity.builder()
				.id(listDolar.get(0).getId())
				.ask(listDolar.get(0).getAsk())
				.bid(listDolar.get(0).getBid())
				.code(listDolar.get(0).getCode())
				.codein(listDolar.get(0).getCodein())
				.create_date(listDolar.get(0).getCreate_date())
				.high(listDolar.get(0).getHigh())
				.low(listDolar.get(0).getLow())
				.name(listDolar.get(0).getName())
				.pctChange(listDolar.get(0).getPctChange())
				.timestamp(listDolar.get(0).getTimestamp())
				.varBid(listDolar.get(0).getVarBid())
				.build();
		h2Repository.save(entity);
		System.out.println("Saving in H2: " + listDolar);
		return listDolar;
	}
}
