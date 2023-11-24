package com.tobeto.a.spring.intro.repositories;

import com.tobeto.a.spring.intro.entities.Individual;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndividualRepository extends JpaRepository<Individual, Integer> {

}
