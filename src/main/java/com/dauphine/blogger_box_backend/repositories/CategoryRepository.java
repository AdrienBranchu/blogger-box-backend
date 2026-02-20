package com.dauphine.blogger_box_backend.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dauphine.blogger_box_backend.models.Category;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}