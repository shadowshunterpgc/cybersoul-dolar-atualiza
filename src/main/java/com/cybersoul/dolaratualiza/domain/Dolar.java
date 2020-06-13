package com.cybersoul.dolaratualiza.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class Dolar {
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
}
