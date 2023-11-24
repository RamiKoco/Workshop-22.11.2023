package com.tobeto.a.spring.intro.services.dtos.payment.requests;

import com.tobeto.a.spring.intro.entities.Customer;
import lombok.Data;

@Data
public class AddPaymentRequest {
    private double dailyPrice;
    private double weeklyPrice;
    private double monthlyPrice;
    private double assurancePrice;
    private double fuelPrice;
    private Customer customerId;
}