package com.userslist.crud;

import com.userslist.crud.model.User;
import com.userslist.crud.repository.UserRepository;
import com.userslist.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		/*
		User user1 = new User(1L, "Jermell", "Charlo", "charlo@charlo.com");
		userRepository.save(user1);

		User user2 = new User(2L, "Marcos", "Maidana", "maidana@maidana.com");
		userRepository.save(user2);

		 */
	}
}
