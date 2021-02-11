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
			repository.save(new RedArmyVolunteer("Artyom", "Chyornyj", "Moscow"));
			repository.save(new RedArmyVolunteer("Leon", "Trotsky ", "Ukraine"));
			repository.save(new RedArmyVolunteer("Vladimir", "Lenin", "St. Petersburg"));
			repository.save(new RedArmyVolunteer("Nadezhda", "Krupskaya ", "Vadivlostock"));
			repository.save(new RedArmyVolunteer("Bella", "Akhmadulina", "Stalingrad"));

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
			log.info("Customer found with findByLastName('Trotsky'):");
			log.info("--------------------------------------------");
			repository.findByLastName("Trotsky").forEach(bauer -> {
				log.info(bauer.toString());
			});
			
			log.info("");
		};
	}
}
		
		