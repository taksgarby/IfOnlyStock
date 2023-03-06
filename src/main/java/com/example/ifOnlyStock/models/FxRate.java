package com.example.ifOnlyStock.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Entity
@Table(name = "fxRate")
public class FxRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="fromCurrency")
    private String fromCurrency;

    @Column(name="toCurrency")
    private String toCurrency;

    @Column(name="rate")
    private BigDecimal rate;


    public FxRate(String name, String fromCurrency, String toCurrency, BigDecimal rate) {
        this.name = name;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.rate = rate;

    }

    public FxRate() {}

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal convertAmount(BigDecimal amount) {

        return getRate().multiply(amount).setScale(2, RoundingMode.HALF_DOWN);
    }


}
