package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.repo.IPersonRepo;

@RestController
@RequestMapping("/persons")
public class RestDemoController {
	
	@Autowired
	private IPersonRepo repo;
	
	@GetMapping
	public List<Person> listar(){
		return repo.findAll();
		
	}
	
	@PostMapping
	public void insertar(@RequestBody Person perr){
		 repo.save(perr);
		
	}
	
	@PutMapping
	public void modify(@RequestBody Person perr){
		 repo.save(perr);
		
	}
	
	@DeleteMapping(value="/{id}")
	public void delete(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}

}
