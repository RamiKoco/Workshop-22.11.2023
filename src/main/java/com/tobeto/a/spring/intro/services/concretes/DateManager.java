package com.tobeto.a.spring.intro.services.concretes;

import com.tobeto.a.spring.intro.entities.Date;
import com.tobeto.a.spring.intro.repositories.DateRepository;
import com.tobeto.a.spring.intro.services.abstracts.DateService;
import com.tobeto.a.spring.intro.services.dtos.date.requests.AddDateRequest;
import com.tobeto.a.spring.intro.services.dtos.date.requests.UpdateDateRequest;
import org.springframework.stereotype.Service;

@Service
public class DateManager implements DateService {

    private final DateRepository dateRepository;

    public DateManager(DateRepository dateRepository) {
        this.dateRepository = dateRepository;
    }

    @Override
    public void add(AddDateRequest addDateRequest) {
        Date date = new Date();
        date.setStartDate(addDateRequest.getStartDate());
        date.setEndDate(addDateRequest.getEndDate());
        date.setExtendDate(addDateRequest.getExtendDate());
        dateRepository.save(date);
    }

    @Override
    public void delete(int id) {
        Date dateToDelete = dateRepository.findById(id).orElseThrow();
        dateRepository.delete(dateToDelete);
    }

    @Override
    public void update(UpdateDateRequest updateDateRequest) {
        Date dateToUpdate = dateRepository.findById(updateDateRequest.getId()).orElseThrow();
        dateToUpdate.setStartDate(updateDateRequest.getStartDate());
        dateToUpdate.setEndDate(updateDateRequest.getEndDate());
        dateToUpdate.setExtendDate(updateDateRequest.getExtendDate());
        dateRepository.save(dateToUpdate);
    }
}