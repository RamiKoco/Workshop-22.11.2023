package com.tobeto.a.spring.intro.services.dtos.location.requests;

import lombok.Data;

@Data
public class UpdateLocationRequest {
    private int id;
    private String pickUpLocation;
    private String dropOffLocation;
}
