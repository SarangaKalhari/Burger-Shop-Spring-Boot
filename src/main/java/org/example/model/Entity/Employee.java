package org.example.model.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private long phoneNumber;

    private String name;

    @Column(unique = true)
    private String nic;

    private String address;
    private String city;
    private String province;
    private String postalCode;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal salary;

}
