package com.tobeto.a.spring.intro.services.dtos.date.requests;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UpdateDateRequest {
    private int id;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate extendDate;
}
