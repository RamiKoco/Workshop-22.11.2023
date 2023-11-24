package com.tobeto.a.spring.intro.repositories;

import com.tobeto.a.spring.intro.entities.Date;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DateRepository extends JpaRepository<Date, Integer> {

}
