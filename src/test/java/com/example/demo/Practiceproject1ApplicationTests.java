package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.User;
import com.example.demo.repo.IUserRepo;


@SpringBootTest
public class Practiceproject1ApplicationTests {

	@Autowired
	private IUserRepo repo;
	
	@Test
	public void newUser() {
		User us = new User();
		us.setId(2);
		us.setName("vincentR");
		us.setPassword("1234");
		User retorno = repo.save(us);
		
		assertTrue(retorno.getPassword().equalsIgnoreCase(us.getPassword()));
	}

}
