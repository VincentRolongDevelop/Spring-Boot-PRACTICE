package com.example.demo.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.example.demo.Practiceproject1Application;

/*
 *VIDEO 4:

If we have a class that you want to used by Spring to be able to 
have an instance in its memory you have to annotate it with the 
Stereotypes, the best option for data storage or repository is 

@Repository as you can see below

 ⬇ ⬇ ⬇ ⬇ ⬇ ⬇
*/

/*
 *VIDEO 5:

Sometimes we need or have more than one implementation of an Interface
to solve that problem we have the annotation @Qualifier that makes this separation possible,
with this we can decided what of the 2 implementation will work.


@Qualifier works as you can see below

 ⬇ ⬇ ⬇ ⬇ ⬇ ⬇
*/
@Repository
@Qualifier("person1")
public class PersonRepoImpl implements InterfacePerson{
	
	private static Logger LOG = LoggerFactory.getLogger(Practiceproject1Application.class);

	@Override
	public void register(String name) {
		//Video 4 general idea: And finally we end the name traveling here where the method register do its magic
		LOG.info("We register "+name+" name in the line");
		
	}
	

}
