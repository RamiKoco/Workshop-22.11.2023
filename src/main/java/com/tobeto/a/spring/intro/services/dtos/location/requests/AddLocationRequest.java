package com.tobeto.a.spring.intro.services.dtos.location.requests;

import lombok.Data;

@Data
public class AddLocationRequest {
    private String pickUpLocation;
    private String dropOffLocation;
}
