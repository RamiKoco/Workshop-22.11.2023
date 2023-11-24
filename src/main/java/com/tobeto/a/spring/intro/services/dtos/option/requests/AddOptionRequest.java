package com.tobeto.a.spring.intro.services.dtos.option.requests;

import lombok.Data;

@Data
public class AddOptionRequest {
    private double rentalCancellationPrice;
    private double additionalDriverPrice;
    private double roadsideAssistancePrice;
}
