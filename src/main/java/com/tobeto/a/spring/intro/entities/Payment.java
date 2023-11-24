package com.tobeto.a.spring.intro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "payments")
@Entity
@Getter
@Setter
public class Payment {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "daily_price")
    private double dailyPrice;

    @Column(name = "weekly_price")
    private double weeklyPrice;

    @Column(name = "monthly_price")
    private double monthlyPrice;

    @Column(name = "assurance_price")
    private double assurancePrice;

    @Column(name = "fuel_price")
    private double fuelPrice;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "payment")
    @JsonIgnore
    private List<Rental> rental;

    @OneToMany(mappedBy = "payment")
    @JsonIgnore
    private List<Price> price;
}
