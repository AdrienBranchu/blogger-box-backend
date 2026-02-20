package com.dauphine.blogger_box_backend.services;

import java.util.List;
import java.util.UUID;

import com.dauphine.blogger_box_backend.models.Category;

public interface CategoryService {
    List<Category> getAll();
    Category getById(UUID id);
    Category create(String name);
    Category update(UUID id, String name);
    boolean deleteById(UUID id);
}