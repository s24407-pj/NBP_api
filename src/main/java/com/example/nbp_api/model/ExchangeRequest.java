package com.example.nbp_api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "requests")
public class ExchangeRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Max(3)
    private String currency;
    @NotBlank
    private int days;
    @NotBlank
    private float rate;
    @NotBlank
    private LocalDateTime date;

    public ExchangeRequest(String currency, int days, float rate, LocalDateTime date) {
        this.currency = currency;
        this.days = days;
        this.rate = rate;
        this.date = date;
    }

    public ExchangeRequest() {

    }
}
