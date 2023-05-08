package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.pojo.Category;
import com.example.repo.Categoryepo;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {
    @Autowired
    private Categoryepo repo;

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @PostMapping("")
    public Category addCategory(@RequestBody Category category) {
        return repo.save(category);
    }

    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable Long id, @RequestBody Category updatedCategory) {
        Category categoryToUpdate = repo.findById(id).orElse(null);

        if (categoryToUpdate != null) {
            categoryToUpdate.setName(updatedCategory.getName());
        }

        return repo.save(categoryToUpdate);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
