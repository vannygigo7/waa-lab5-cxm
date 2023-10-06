package com.sangvaleap.lab5cxm.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDate;

@Embeddable
@Data
public class Payment {
    private LocalDate paydate;
    private double amount;
}
