package com.sangvaleap.lab5cxm.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String appdate;
    @Embedded
    private Payment payment;
    @ManyToOne
    @JoinColumn(name = "patient")
    private Patient patient;
    @ManyToOne
    @JoinColumn(name = "doctor")
    private Doctor doctor;
}
