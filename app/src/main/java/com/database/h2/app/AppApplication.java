package com.database.h2.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.database.h2.app.Repository.CustomerRepository;

@SpringBootApplication
//public class AppApplication implements CommandLineRunner {
public class AppApplication {

	@Autowired private CustomerRepository customerRepository;
	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
		
	}

	//@Override
	//public void run(String... args) throws Exception {
		//customerRepository.findAll().forEach(c -> System.out.println(c));
		//System.out.println("Fin de DB");
	//}

}
