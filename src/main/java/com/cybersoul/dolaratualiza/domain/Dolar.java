package com.cybersoul.dolaratualiza.domain;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
@Entity
public class Dolar {
	@Id
	@GeneratedValue
	private UUID id;
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

