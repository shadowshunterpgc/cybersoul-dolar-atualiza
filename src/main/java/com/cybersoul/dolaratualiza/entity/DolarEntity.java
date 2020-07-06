package com.cybersoul.dolaratualiza.entity;

import com.cybersoul.dolaratualiza.domain.Dolar;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Builder
@Entity
@AllArgsConstructor
@Table(name="Dolar")
public class DolarEntity {

    public DolarEntity() { }

    @Id
    @GeneratedValue
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
}
