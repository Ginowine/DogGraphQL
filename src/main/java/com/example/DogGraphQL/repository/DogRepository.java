package com.example.DogGraphQL.repository;

import com.example.DogGraphQL.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
