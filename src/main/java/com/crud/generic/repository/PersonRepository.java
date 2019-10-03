package com.crud.generic.repository;

import org.springframework.stereotype.Repository;

import com.crud.generic.entity.Person;
import com.crud.generic.repository.generic.GenericRepository;

@Repository
public interface PersonRepository extends GenericRepository<Person>{

}
