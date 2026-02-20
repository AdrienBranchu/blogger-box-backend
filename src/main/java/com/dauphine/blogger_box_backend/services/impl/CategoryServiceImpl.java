package com.dauphine.blogger_box_backend.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.dauphine.blogger_box_backend.models.Category;
import com.dauphine.blogger_box_backend.repositories.CategoryRepository;
import com.dauphine.blogger_box_backend.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repository;

    public CategoryServiceImpl(CategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Category> getAll() {
        return repository.findAll();
    }

    @Override
    public Category getById(UUID id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Category create(String name) {
        Category category = new Category(UUID.randomUUID(), name);
        return repository.save(category);
    }

    @Override
    public Category update(UUID id, String name) {
        Category category = getById(id);
        if (category != null) {
            category.setName(name);
            return repository.save(category);
        }
        return null;
    }

    @Override
    public boolean deleteById(UUID id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}