package com.tobeto.a.spring.intro.repositories;

import com.tobeto.a.spring.intro.entities.Option;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepository extends JpaRepository<Option, Integer> {

}
