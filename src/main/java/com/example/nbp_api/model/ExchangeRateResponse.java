package com.example.nbp_api.model;

import jakarta.validation.constraints.Max;

import java.util.List;

public class ExchangeRateResponse {

    private Character table;
    private String currencyFullName;
    @Max(3)
    private String currencyCode;
    private List<Rate> rates;

    public ExchangeRateResponse(Character table, String currencyFullName, String currencyCode, List<Rate> rateList) {
        this.table = table;
        this.currencyFullName = currencyFullName;
        this.currencyCode = currencyCode;
        this.rates = rateList;
    }

    public ExchangeRateResponse() {
    }

    public Character getTable() {

        return table;
    }

    public String getCurrencyFullName() {
        return currencyFullName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public List<Rate> getRates() {
        return rates;
    }
}
