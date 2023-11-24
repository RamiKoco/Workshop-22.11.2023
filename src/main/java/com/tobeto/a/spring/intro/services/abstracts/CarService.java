package com.tobeto.a.spring.intro.services.abstracts;

import com.tobeto.a.spring.intro.services.dtos.car.requests.AddCarRequest;
import com.tobeto.a.spring.intro.services.dtos.car.requests.UpdateCarRequest;

public interface CarService {
    void add(AddCarRequest addCarRequest);

    void delete(int id);

    void update(UpdateCarRequest updateCarRequest);
}