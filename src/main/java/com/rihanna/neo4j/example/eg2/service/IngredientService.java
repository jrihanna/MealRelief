package com.rihanna.neo4j.example.eg2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rihanna.neo4j.example.eg2.repository.IngredientRepository;

@Service
public class IngredientService {
	
	@Autowired
	IngredientRepository ingredientRepository;

}
