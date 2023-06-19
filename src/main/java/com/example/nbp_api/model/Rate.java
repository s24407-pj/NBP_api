package com.example.nbp_api.model;

import java.util.Date;
import java.util.List;

public class Rates extends ExchangeRateResponse {
    private String no;
    private Date effectiveDate;
    private float mid;

    public Rates(Character table, String currencyFullName, String currencyCode, List<Rates> rateList, String no, Date effectiveDate, float mid) {
        super(table, currencyFullName, currencyCode, rateList);
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.mid = mid;
    }

    public String getNo() {
        return no;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public float getMid() {
        return mid;
    }
}
