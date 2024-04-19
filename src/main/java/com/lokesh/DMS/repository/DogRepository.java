package com.lokesh.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.lokesh.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);

}

