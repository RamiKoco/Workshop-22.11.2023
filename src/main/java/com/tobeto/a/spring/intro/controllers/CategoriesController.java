package com.tobeto.a.spring.intro.controllers;

import com.tobeto.a.spring.intro.services.abstracts.CategoryService;
import com.tobeto.a.spring.intro.services.dtos.category.requests.AddCategoryRequest;
import com.tobeto.a.spring.intro.services.dtos.category.requests.UpdateCategoryRequest;
import org.springframework.web.bind.annotation.*;


// Single Responsibility

@RestController
@RequestMapping("api/categories")
public class CategoriesController {
    // Gelen isteği kontrol etmek ve yönlendirmek
    // manager bağımlılığını yüklemek
    // Bağımlılıklar daima soyut nesneler üzerinden

    private final CategoryService categoryService;

    public CategoriesController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public void add(@RequestBody AddCategoryRequest addCategoryRequest) {
        categoryService.add(addCategoryRequest);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        categoryService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody UpdateCategoryRequest updateCategoryRequest) {
        categoryService.update(updateCategoryRequest);
    }
}
