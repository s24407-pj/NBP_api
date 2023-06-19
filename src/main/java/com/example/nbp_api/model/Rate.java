package com.example.nbp_api.model;

import java.util.Date;

public class Rate {
    private String no;
    private Date effectiveDate;
    private float mid;

    public Rate(String no, Date effectiveDate, float mid) {

        this.no = no;
        this.effectiveDate = effectiveDate;
        this.mid = mid;
    }

    public Rate() {
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
