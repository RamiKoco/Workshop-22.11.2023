package com.tobeto.a.spring.intro.services.abstracts;


import com.tobeto.a.spring.intro.services.dtos.payment.requests.AddPaymentRequest;
import com.tobeto.a.spring.intro.services.dtos.payment.requests.UpdatePaymentRequest;

public interface PaymentService {

    void add(AddPaymentRequest addPaymentRequest);

    void delete(int id);

    void update(UpdatePaymentRequest updatePaymentRequest);
}
