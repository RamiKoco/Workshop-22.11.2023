package com.tobeto.a.spring.intro.services.abstracts;

import com.tobeto.a.spring.intro.services.dtos.category.requests.AddCategoryRequest;
import com.tobeto.a.spring.intro.services.dtos.category.requests.UpdateCategoryRequest;

public interface CategoryService {

    void add(AddCategoryRequest addCategoryRequest);

    void delete(int id);

    void update(UpdateCategoryRequest updateCategoryRequest);
}
