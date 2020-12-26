package com.rihanna.neo4j.example.eg2.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.rihanna.neo4j.example.eg2.model.RecipeModel;

public interface RecipeRepository extends Neo4jRepository<RecipeModel, Long> {

}
