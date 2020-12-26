package com.rihanna.neo4j.example.eg2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rihanna.neo4j.example.eg2.repository.RecipeRepository;

@Service
public class RecipeService {
	
	@Autowired
	RecipeRepository recipeRepository;

}
