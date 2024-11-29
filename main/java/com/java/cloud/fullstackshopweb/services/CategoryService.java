package com.java.cloud.fullstackshopweb.services;

import com.java.cloud.fullstackshopweb.entities.Category;
import com.java.cloud.fullstackshopweb.repository.CategoryRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepositoy categoryRepositoy;

    public Category save(Category category) {
        return categoryRepositoy.save(category);
    }

    public Category update(Category category) {
        return categoryRepositoy.save(category);
    }

    public List<Category> findAll() {
        return categoryRepositoy.findAll();
    }

    public Category findById(Integer id) {
        return categoryRepositoy.findById(id).orElse(null);
    }

    public void delete(Integer id) {
        categoryRepositoy.deleteById(id);
    }

    public List<Category> findByCategoryName(String categoryName) {
        return categoryRepositoy.findByName(categoryName);
    }
}
