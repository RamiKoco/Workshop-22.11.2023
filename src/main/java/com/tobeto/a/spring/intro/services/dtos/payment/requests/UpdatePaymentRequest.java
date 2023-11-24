package com.tobeto.a.spring.intro.services.dtos.payment.requests;

import com.tobeto.a.spring.intro.entities.Customer;
import lombok.Data;

@Data
public class UpdatePaymentRequest {
    private int id;
    private double dailyPrice;
    private double weeklyPrice;
    private double monthlyPrice;
    private Customer customerId;
}