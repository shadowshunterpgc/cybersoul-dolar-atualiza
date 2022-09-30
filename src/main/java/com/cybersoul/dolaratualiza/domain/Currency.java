package com.cybersoul.dolaratualiza.domain;

import java.util.List;
import java.util.UUID;

import com.cybersoul.dolaratualiza.entity.CurrencyEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Currency {
	public UUID id;
	private String code;
	private String codein;
	private String name;
	private String high;
	private String low;
	private String varBid;
	private String pctChange;
	private String bid;
	private String ask;
	private String timestamp;
	private String create_date;

	public Currency() {

	}

	public CurrencyEntity getDolarList(List<Currency> listDolar) {
		listDolar.get(0).setId(UUID.randomUUID());
		CurrencyEntity entity = CurrencyEntity.builder()
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
		return entity;
	}
}


