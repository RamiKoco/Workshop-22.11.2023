package com.tobeto.a.spring.intro.services.abstracts;

import com.tobeto.a.spring.intro.services.dtos.individual.requests.AddIndividualRequest;
import com.tobeto.a.spring.intro.services.dtos.individual.requests.UpdateIndividualRequest;

public interface IndividualService {

    void add(AddIndividualRequest addIndividualRequest);

    void delete(int id);

    void update(UpdateIndividualRequest updateIndividualRequest);
}
