package com.myHomeworkProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.myHomeworkProject.domain.RedArmyVolunteer;
import com.myHomeworkProject.repository.IRedArmyRepository;

@SpringBootApplication
public class MyHomeworkProjectOneApplication {
	
	private static final Logger log = LoggerFactory.getLogger(MyHomeworkProjectOneApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MyHomeworkProjectOneApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(IRedArmyRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new RedArmyVolunteer("Michael", "Smith", "Vladivlostock"));
			repository.save(new RedArmyVolunteer("Aaron", "Moon", "Moscow"));
			repository.save(new RedArmyVolunteer("Kim", "Lassiter", "Stalingrad"));
			repository.save(new RedArmyVolunteer("Joan", "Daniels", "Leningrad"));
			repository.save(new RedArmyVolunteer("Eric", "Patterson", "St. Petersburg"));

			// read all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (RedArmyVolunteer volunteer : repository.findAll()) {
				log.info(volunteer.toString());
			}
			log.info("");

			// read an individual customer by ID
			repository.findById(1L)
				.ifPresent(volunteer -> {
					log.info("Customer found with findById(1L):");
					log.info("--------------------------------");
					log.info(volunteer.toString());
					log.info("");
				});

			// read customers by last name
			log.info("Customer found with findByLastName('Patterson'):");
			log.info("--------------------------------------------");
			repository.findByLastName("Patterson").forEach(bauer -> {
				log.info(bauer.toString());
			});
			
			log.info("");
		};
	}
}
		
		