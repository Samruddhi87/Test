//package com.example.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import com.example.pojo.Category;
//
//@Service
//public class CategoryService {
//    
//    private List<Category> categories = new ArrayList<>();
//    
//    public List<Category> getAllCategories() {
//        return categories;
//    }
//    
//    public Category getCategoryById(Long id) {
//        return categories.stream()
//                .filter(category -> category.getId().equals(id))
//                .findFirst()
//                .orElseThrow(() -> new ResourceNotFoundException("Category not found with id: " + id));
//    }
//    
//    public Category createCategory(Category category) {
//        category.setId((long) (categories.size() + 1));
//        categories.add(category);
//        return category;
//    }
//    
//    public Category updateCategory(Long id, Category category) {
//        Category existingCategory = getCategoryById(id);
//        existingCategory.setName(category.getName());
//        return existingCategory;
//    }
//    
//    public void deleteCategory(Long id) {
//        Category category = getCategoryById(id);
//        categories.remove(category);
//    }
//}
