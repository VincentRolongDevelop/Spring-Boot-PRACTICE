package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Person;

public interface IPersonRepo extends JpaRepository<Person, Integer>{

}
