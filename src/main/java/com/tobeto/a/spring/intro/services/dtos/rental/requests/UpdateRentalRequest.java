package com.tobeto.a.spring.intro.services.dtos.rental.requests;

import com.tobeto.a.spring.intro.entities.*;
import lombok.Data;

@Data
public class UpdateRentalRequest {
    private int id;
    private Payment paymentId;
    private Customer customerId;
    private Car carId;
    private Date dateId;
    private Location locationId;
}