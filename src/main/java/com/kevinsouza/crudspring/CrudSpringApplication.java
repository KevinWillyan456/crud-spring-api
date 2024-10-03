package com.kevinsouza.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.kevinsouza.crudspring.models.Course;
import com.kevinsouza.crudspring.repositories.CourseRepository;

@SpringBootApplication
public class CrudSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();

			Course c = new Course();
			c.setName("Angular com Spring Boot");
			c.setCategory("full-stack");

			Course c2 = new Course();
			c2.setName("React com Spring Boot");
			c2.setCategory("full-stack");

			courseRepository.save(c);
			courseRepository.save(c2);
		};
	}
}
