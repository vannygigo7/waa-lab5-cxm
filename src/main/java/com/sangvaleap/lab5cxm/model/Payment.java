package com.sangvaleap.lab5cxm.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDate;

@Embeddable
@Data
public class Payment {
    private String paydate;
    private double amount;
}
