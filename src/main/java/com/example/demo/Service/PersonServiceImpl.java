package com.example.demo.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.repository.InterfacePerson;

//Video 4 general idea: Then after that the name goes for the Repository layer thanks to this instance
//Continues reading there

/*
 *VIDEO 4:

If we have a class that you want to used by Spring to be able to 
represent a "BUSINESS LOGIC" you have to annotate it with the 
Stereotypes, the best option for the service logic is 

@Service as you can see below

 ⬇ ⬇ ⬇ ⬇ ⬇ ⬇
*/
@Service
public class PersonServiceImpl implements IpersonService{
	
	/*
	 *VIDEO 4:

	When you write @Autowired and is executed the framework will
	look for a defined instance for an stereotype.
	
	In this case it will search for an implementation of "InterfacePerson"
	If you put @Autowired it will see that there is an instance 
	
	@Service works as you can see below

	 ⬇ ⬇ ⬇ ⬇ ⬇ ⬇
	*/
	@Autowired
	@Qualifier("person2")
	private InterfacePerson repo;

	@Override
	public void register(String name) {
	/*	
	 * *NOT NECESARY ANYMORE THANKS TO ANNOTATIONS* *
		repo = new PersonRepoImpl();
		
		Video 4: Thanks to the  @Autowired annotation we don't need 
		to use an instance anymore, because we can access to the defined instance
		in the spring-boot content.
		
	*/	
		repo.register(name);
	}

}
