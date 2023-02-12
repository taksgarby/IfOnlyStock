package com.example.ifOnlyStock.models;

public enum Country {

    USA("USA"),
    GERMANY("DEU"),
    UK("GBR"),
    CHINA("CHN"),
    JAPAN("JPN");

    private final String isoCode;

    Country(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getIsoCode() {
        return isoCode;
    }

}
