package me.dio.santanderdevweek2023api.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")

public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true)
    private String number;
    @Column(name = "additional_limit", precision = 13, scale = 2)
    private BigDecimal limit;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
