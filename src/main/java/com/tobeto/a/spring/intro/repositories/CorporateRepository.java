package com.tobeto.a.spring.intro.repositories;

import com.tobeto.a.spring.intro.entities.Corporate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorporateRepository extends JpaRepository<Corporate, Integer> {

}
