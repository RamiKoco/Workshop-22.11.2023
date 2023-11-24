package com.tobeto.a.spring.intro.services.concretes;

import com.tobeto.a.spring.intro.entities.Category;
import com.tobeto.a.spring.intro.repositories.CategoryRepository;
import com.tobeto.a.spring.intro.services.abstracts.CategoryService;
import com.tobeto.a.spring.intro.services.dtos.category.requests.AddCategoryRequest;
import com.tobeto.a.spring.intro.services.dtos.category.requests.UpdateCategoryRequest;
import org.springframework.stereotype.Service;

// Manager
@Service
public class CategoryManager implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryManager(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void add(AddCategoryRequest addCategoryRequest) {
        Category category = new Category();
        category.setName(addCategoryRequest.getName());
        categoryRepository.save(category);
    }

    @Override
    public void delete(int id) {
        Category categoryToDelete = categoryRepository.findById(id).orElseThrow();
        categoryRepository.delete(categoryToDelete);
    }

    @Override
    public void update(UpdateCategoryRequest updateCategoryRequest) {
        Category categoryToUpdate = categoryRepository.findById(updateCategoryRequest.getId()).orElseThrow();
        categoryToUpdate.setName(updateCategoryRequest.getName());
        categoryRepository.save(categoryToUpdate);
    }

}
