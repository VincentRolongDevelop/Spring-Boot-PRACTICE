package com.example.demo.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.example.demo.Practiceproject1Application;

@Repository
@Qualifier("person2")
public class PersonRepoImpl2 implements InterfacePerson{
	
	private static Logger LOG = LoggerFactory.getLogger(Practiceproject1Application.class);

	@Override
	public void register(String name) {
		//Video 4 general idea: And finally we end the name traveling here where the method register do its magic
		LOG.info("WE REGISTER "+name+" IN THE SECOND LINE");
		
	}
	

}
