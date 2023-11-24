package com.tobeto.a.spring.intro.services.abstracts;

import com.tobeto.a.spring.intro.services.dtos.corporate.requests.AddCorporateRequest;
import com.tobeto.a.spring.intro.services.dtos.corporate.requests.UpdateCorporateRequest;

public interface CorporateService {

    void add(AddCorporateRequest addCorporateRequest);

    void delete(int id);

    void update(UpdateCorporateRequest updateCorporateRequest);
}
