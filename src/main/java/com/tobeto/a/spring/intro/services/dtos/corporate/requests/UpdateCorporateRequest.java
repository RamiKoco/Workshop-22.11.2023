package com.tobeto.a.spring.intro.services.dtos.corporate.requests;

import com.tobeto.a.spring.intro.entities.Customer;
import lombok.Data;

@Data
public class UpdateCorporateRequest {
    private int id;
    private String companyName;
    private String contactName;
    private String contactTitle;
    private Customer customerId;
}