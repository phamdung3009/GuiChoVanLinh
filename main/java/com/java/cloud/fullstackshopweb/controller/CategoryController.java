package com.java.cloud.fullstackshopweb.controller;

import com.java.cloud.fullstackshopweb.entities.Category;
import com.java.cloud.fullstackshopweb.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@PostMapping
	public Category createCategory(@RequestBody Category category) {
		return categoryService.save(category);
	}

	@PutMapping("/{id}")
	public Category updateCategory(@PathVariable Integer id, @RequestBody Category category) {
		category.setId(id);
		return categoryService.update(category);
	}

	@GetMapping
	public List<Category> getAllCategories() {
		return categoryService.findAll();
	}

	@GetMapping("/{id}")
	public Category getCategoryById(@PathVariable Integer id) {
		return categoryService.findById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteCategory(@PathVariable Integer id) {
		categoryService.delete(id);
	}

	@GetMapping("/search")
	public List<Category> searchCategory(@RequestParam String name) {
		return categoryService.findByCategoryName(name);
	}
}
