package com.tobeto.a.spring.intro.services.concretes;

import com.tobeto.a.spring.intro.entities.Individual;
import com.tobeto.a.spring.intro.repositories.IndividualRepository;
import com.tobeto.a.spring.intro.services.abstracts.IndividualService;
import com.tobeto.a.spring.intro.services.dtos.individual.requests.AddIndividualRequest;
import com.tobeto.a.spring.intro.services.dtos.individual.requests.UpdateIndividualRequest;
import org.springframework.stereotype.Service;

@Service
public class IndividualManager implements IndividualService {

    private final IndividualRepository individualRepository;

    public IndividualManager(IndividualRepository individualRepository) {
        this.individualRepository = individualRepository;
    }

    @Override
    public void add(AddIndividualRequest addIndividualRequest) {
        Individual individual = new Individual();
        individual.setName(addIndividualRequest.getName());
        individual.setSurname(addIndividualRequest.getSurname());
        individual.setBirthDate(addIndividualRequest.getBirthDate());
        individual.setGender(addIndividualRequest.getGender());
        individual.setIdentificationNumber(addIndividualRequest.getIdentificationNumber());
        individual.setCustomer(addIndividualRequest.getCustomerId());
        individualRepository.save(individual);
    }

    @Override
    public void delete(int id) {
        Individual individualToDelete = individualRepository.findById(id).orElseThrow();
        individualRepository.delete(individualToDelete);
    }

    @Override
    public void update(UpdateIndividualRequest updateIndividualRequest) {
        Individual individualToUpdate = individualRepository.findById(updateIndividualRequest.getId()).orElseThrow();
        individualToUpdate.setName(updateIndividualRequest.getName());
        individualToUpdate.setSurname(updateIndividualRequest.getSurname());
        individualToUpdate.setBirthDate(updateIndividualRequest.getBirthDate());
        individualToUpdate.setGender(updateIndividualRequest.getGender());
        individualToUpdate.setCustomer(updateIndividualRequest.getCustomerId());
        individualRepository.save(individualToUpdate);
    }
}