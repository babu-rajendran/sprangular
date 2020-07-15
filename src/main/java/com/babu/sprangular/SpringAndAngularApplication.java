package com.babu.sprangular;

import com.babu.sprangular.dal.UserRepository;
import com.babu.sprangular.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class SpringAndAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAndAngularApplication.class, args);
	}

	// Test if the repository works
	/*
	@Bean
	CommandLineRunner init(UserRepository userRepository) {
		return args -> {
			Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
				User user = new User(name, name.toLowerCase() + "@domain.com");
				userRepository.save(user);
			});
			userRepository.findAll().forEach(System.out::println);
		};
	}
	*/

}
