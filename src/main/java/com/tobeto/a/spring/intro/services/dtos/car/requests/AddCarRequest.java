package com.tobeto.a.spring.intro.services.dtos.car.requests;

import com.tobeto.a.spring.intro.entities.Category;
import lombok.Data;

@Data
public class AddCarRequest {
    private String brand;
    private String model;
    private int year;
    private String color;
    private String status;
    private String numberPlate;
    private Category categoryId;
}