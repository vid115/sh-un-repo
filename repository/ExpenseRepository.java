package com.example.ltts.expensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ltts.expensetracker.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
	
}
