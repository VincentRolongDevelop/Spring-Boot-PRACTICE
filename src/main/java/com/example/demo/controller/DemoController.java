package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Person;
import com.example.demo.repo.IPersonRepo;

/*
 *VIDEO 6
 *This annotation is used when you have a class with a logic of a controller o a business
 * ⬇ ⬇ ⬇ ⬇ ⬇ ⬇
 */
@Controller
public class DemoController {
	
	@Autowired
	private IPersonRepo repo;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		Person p= new Person();
		p.setIdPerson(1);
		p.setName("Vincent");
		repo.save(p);
		
		model.addAttribute("name", name);
		return "index";
	}
	
	@GetMapping("/listar")
	public String greeting( Model model) {
		//Logic	
		model.addAttribute("persons", repo.findAll());
		return "index";
	}
}


	

