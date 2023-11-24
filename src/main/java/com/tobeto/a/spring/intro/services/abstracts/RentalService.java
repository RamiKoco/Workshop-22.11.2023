package com.tobeto.a.spring.intro.services.abstracts;

import com.tobeto.a.spring.intro.services.dtos.rental.requests.AddRentalRequest;
import com.tobeto.a.spring.intro.services.dtos.rental.requests.UpdateRentalRequest;

public interface RentalService {

    void add(AddRentalRequest addRentalRequest);

    void delete(int id);

    void update(UpdateRentalRequest updateRentalRequest);
}
