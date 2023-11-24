package com.tobeto.a.spring.intro.services.abstracts;

import com.tobeto.a.spring.intro.services.dtos.location.requests.AddLocationRequest;
import com.tobeto.a.spring.intro.services.dtos.location.requests.UpdateLocationRequest;

public interface LocationService {

    void add(AddLocationRequest addLocationRequest);

    void delete(int id);

    void update(UpdateLocationRequest updateLocationRequest);
}
