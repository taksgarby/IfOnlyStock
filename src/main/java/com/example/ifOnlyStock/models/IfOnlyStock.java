package com.example.ifOnlyStock.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "ifOnlyStock")
public class IfOnlyStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "companyName")
    private String companyName;

    @Column(name = "maxPrice")
    private double maxPrice;

    @Column(name = "minPrice")
    private double minPrice;

    @Column(name = "currentPrice")
    private double currentPrice;

    @Column(name = "maxPriceDate")
    private LocalDate maxPriceDate;

    @Column(name = "minPriceDate")
    private LocalDate minPriceDate;

    @Column(name = "currentPriceDate")
    private LocalDate currentPriceDate;

    @Column(name = "currency")
    private String currency;

    Country country;

    IndustryType industryType;

    public IfOnlyStock(String companyName, double maxPrice, double minPrice, double currentPrice, LocalDate maxPriceDate,
                       LocalDate minPriceDate, LocalDate currentPriceDate, String currency, Country country,
                       IndustryType industryType) {
                this.companyName = companyName;
                this.maxPrice = maxPrice;
                this.minPrice = minPrice;
                this.currentPrice = currentPrice;
                this.maxPriceDate = maxPriceDate;
                this.minPriceDate = minPriceDate;
                this.currentPriceDate = currentPriceDate;
                this.currency = currency;
                this.country = country;
                this.industryType = industryType;
    }

    public IfOnlyStock() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }


    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    public LocalDate getMaxPriceDate() {
        return maxPriceDate;
    }

    public void setMaxPriceDate(LocalDate maxPriceDate) {
        this.maxPriceDate = maxPriceDate;
    }

    public LocalDate getMinPriceDate() {
        return minPriceDate;
    }

    public void setMinPriceDate(LocalDate minPriceDate) {
        this.minPriceDate = minPriceDate;
    }

    public LocalDate getCurrentPriceDate() {
        return currentPriceDate;
    }

    public void setCurrentPriceDate(LocalDate currentPriceDate) {
        this.currentPriceDate = currentPriceDate;
    }
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public IndustryType getIndustryType() {
        return industryType;
    }

    public void setIndustryType(IndustryType industryType) {
        this.industryType = industryType;
    }
}
