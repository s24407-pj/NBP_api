package com.example.nbp_api.model;

import jakarta.validation.constraints.Max;

import java.sql.Date;

public class Request {
    private Long id;
    @Max(3)
    private String currency;
    private int days;
    private float rate;
    private Date date;

    public Request(Long id, String currency, int days, float rate, Date date) {
        this.id = id;
        this.currency = currency;
        this.days = days;
        this.rate = rate;
        this.date = date;
    }
}
