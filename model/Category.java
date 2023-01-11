package com.example.ltts.expensetracker.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name="category")
public class Category {
	@Id
	private Long id;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
