package com.tobeto.a.spring.intro.services.concretes;

import com.tobeto.a.spring.intro.entities.Price;
import com.tobeto.a.spring.intro.repositories.PriceRepository;
import com.tobeto.a.spring.intro.services.abstracts.PriceService;
import com.tobeto.a.spring.intro.services.dtos.price.requests.AddPriceRequest;
import com.tobeto.a.spring.intro.services.dtos.price.requests.UpdatePriceRequest;
import org.springframework.stereotype.Service;

@Service
public class PriceManager implements PriceService {
    private final PriceRepository priceRepository;

    public PriceManager(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    @Override
    public void add(AddPriceRequest addPriceRequest) {
        Price price = new Price();
        price.setOption(addPriceRequest.getOptionId());
        price.setPayment(addPriceRequest.getPaymentId());
        priceRepository.save(price);
    }

    @Override
    public void delete(int id) {
        Price priceToDelete = priceRepository.findById(id).orElseThrow();
        priceRepository.delete(priceToDelete);
    }

    @Override
    public void update(UpdatePriceRequest updatePriceRequest) {
        Price priceToUpdate = priceRepository.findById(updatePriceRequest.getId()).orElseThrow();
        priceToUpdate.setOption(updatePriceRequest.getOptionId());
        priceToUpdate.setPayment(updatePriceRequest.getPaymentId());
        priceRepository.save(priceToUpdate);
    }
}