package com.example.demo;

//Video 3: This two are the corrects imports for logger use in console
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//Normal spring-boot imports
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.Service.IpersonService;

//Video 3: In Spring boot if you want to create a console application you must implements the "ComandLineRunner"
@SpringBootApplication
public class Practiceproject1Application implements CommandLineRunner{
	
	//Video 3: Creating a LOG instance
	private static Logger LOG = LoggerFactory.getLogger(Practiceproject1Application.class);
	
	/*Video 4: Explained in the Person Service class
	 *⬇ ⬇ ⬇ ⬇ ⬇ ⬇*/
	@Autowired
	private IpersonService service;

	public static void main(String[] args) {
		SpringApplication.run(Practiceproject1Application.class, args);
	}

	//Video 3: And then override the "run" method that has to use
	//Video 3: If you want to print something in the console is better to use a LOGGER than a simple System.out.print
	@Override
	public void run(String... args) throws Exception {
		//Video 3: LOG application use
		LOG.info("Hello");
		//Video 3: We can try other types of LOGs like a warning info that will appear in the spring boot running messages
		LOG.warn("Be careful");
		
		//Video 4 general idea: This word will travel to the Service layer continues reading there
		service.register("Vincent Rolong");
	}

}
