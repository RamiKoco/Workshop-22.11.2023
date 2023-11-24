package com.tobeto.a.spring.intro.services.dtos.corporate.requests;

import com.tobeto.a.spring.intro.entities.Customer;
import lombok.Data;

@Data
public class AddCorporateRequest {
    private String companyName;
    private String contactName;
    private String contactTitle;
    private String taxNumber;
    private Customer customerId;
}
