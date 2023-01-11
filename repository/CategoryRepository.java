package com.example.ltts.expensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ltts.expensetracker.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {
	Category findByName(String name);

}
