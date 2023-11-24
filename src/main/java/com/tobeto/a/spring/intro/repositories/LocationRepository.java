package com.tobeto.a.spring.intro.repositories;

import com.tobeto.a.spring.intro.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
