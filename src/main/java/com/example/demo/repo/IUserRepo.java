package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Person;
import com.example.demo.model.User;

public interface IUserRepo extends JpaRepository<User, Integer> {

}