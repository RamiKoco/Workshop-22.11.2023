package com.tobeto.a.spring.intro.services.abstracts;

import com.tobeto.a.spring.intro.services.dtos.date.requests.AddDateRequest;
import com.tobeto.a.spring.intro.services.dtos.date.requests.UpdateDateRequest;

public interface DateService {

    void add(AddDateRequest addDateRequest);

    void delete(int id);

    void update(UpdateDateRequest updateDateRequest);
}
