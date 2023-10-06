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
    private Patient patient;
    @ManyToOne
    private Doctor doctor;
}
