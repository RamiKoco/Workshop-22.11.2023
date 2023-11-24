package com.tobeto.a.spring.intro.services.concretes;

import com.tobeto.a.spring.intro.entities.Customer;
import com.tobeto.a.spring.intro.repositories.CustomerRepository;
import com.tobeto.a.spring.intro.services.abstracts.CustomerService;
import com.tobeto.a.spring.intro.services.dtos.customer.requests.AddCustomerRequest;
import com.tobeto.a.spring.intro.services.dtos.customer.requests.UpdateCustomerRequest;
import org.springframework.stereotype.Service;

@Service
public class CustomerManager implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerManager(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void add(AddCustomerRequest addCustomerRequest) {
        Customer customer = new Customer();
        customer.setPhone(addCustomerRequest.getPhone());
        customer.setEmail(addCustomerRequest.getEmail());
        customer.setAddress(addCustomerRequest.getAddress());
        customerRepository.save(customer);
    }

    @Override
    public void delete(int id) {
        Customer customerToDelete = customerRepository.findById(id).orElseThrow();
        customerRepository.delete(customerToDelete);
    }

    @Override
    public void update(UpdateCustomerRequest updateCustomerRequest) {
        Customer customerToUpdate = customerRepository.findById(updateCustomerRequest.getId()).orElseThrow();
        customerToUpdate.setPhone(updateCustomerRequest.getPhone());
        customerToUpdate.setEmail(updateCustomerRequest.getEmail());
        customerToUpdate.setAddress(updateCustomerRequest.getAddress());
        customerRepository.save(customerToUpdate);
    }
}