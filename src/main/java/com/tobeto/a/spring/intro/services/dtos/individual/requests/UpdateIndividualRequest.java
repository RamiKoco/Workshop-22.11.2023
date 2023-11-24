package com.tobeto.a.spring.intro.services.dtos.individual.requests;

import com.tobeto.a.spring.intro.entities.Customer;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UpdateIndividualRequest {
    private int id;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private String gender;
    private Customer customerId;
}
