package com.sangvaleap.lab5cxm.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@SecondaryTable(name = "Address", pkJoinColumns = @PrimaryKeyJoinColumn(name = "patient_id", referencedColumnName = "id"))
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(table = "Address")
    private String street;
    @Column(table = "Address")
    private String city;
    @Column(table = "Address")
    private String zip;
}
