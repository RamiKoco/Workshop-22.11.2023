package com.tobeto.a.spring.intro.services.abstracts;

import com.tobeto.a.spring.intro.services.dtos.price.requests.AddPriceRequest;
import com.tobeto.a.spring.intro.services.dtos.price.requests.UpdatePriceRequest;

public interface PriceService {

    void add(AddPriceRequest addPriceRequest);

    void delete(int id);

    void update(UpdatePriceRequest updatePriceRequest);
}
