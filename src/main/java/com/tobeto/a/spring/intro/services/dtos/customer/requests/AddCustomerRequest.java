package com.tobeto.a.spring.intro.services.dtos.customer.requests;

import lombok.Data;

@Data
public class AddCustomerRequest {
    private String phone;
    private String email;
    private String address;
}
