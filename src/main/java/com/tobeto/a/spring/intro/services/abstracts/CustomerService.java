package com.tobeto.a.spring.intro.services.abstracts;

import com.tobeto.a.spring.intro.services.dtos.customer.requests.AddCustomerRequest;
import com.tobeto.a.spring.intro.services.dtos.customer.requests.UpdateCustomerRequest;

public interface CustomerService {

    void add(AddCustomerRequest addCustomerRequest);

    void delete(int id);

    void update(UpdateCustomerRequest updateCustomerRequest);
}
