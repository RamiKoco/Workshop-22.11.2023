package com.tobeto.a.spring.intro.services.abstracts;

import com.tobeto.a.spring.intro.services.dtos.option.requests.AddOptionRequest;
import com.tobeto.a.spring.intro.services.dtos.option.requests.UpdateOptionRequest;

public interface OptionService {

    void add(AddOptionRequest addOptionRequest);

    void delete(int id);

    void update(UpdateOptionRequest updateOptionRequest);
}