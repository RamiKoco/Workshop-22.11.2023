package com.tobeto.a.spring.intro.repositories;

import com.tobeto.a.spring.intro.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
