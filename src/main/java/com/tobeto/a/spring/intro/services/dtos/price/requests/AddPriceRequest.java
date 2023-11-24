package com.tobeto.a.spring.intro.services.dtos.price.requests;

import com.tobeto.a.spring.intro.entities.Option;
import com.tobeto.a.spring.intro.entities.Payment;
import lombok.Data;

@Data
public class AddPriceRequest {
    private Option optionId;
    private Payment paymentId;
}