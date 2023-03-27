package com.oman;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.oman.todoitem.TodoItem;
import com.oman.todoitem.TodoItemRepo;

@SpringBootApplication
public class OmanApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(OmanApplication.class);

	@Autowired
	private TodoItemRepo todoItemRepo;

	public static void main(String[] args) {
		SpringApplication.run(OmanApplication.class, args);
	}

	@Override
	public void run(String... args) {

		todoItemRepo.save(new TodoItem("title1", "description1", false));
		todoItemRepo.save(new TodoItem("title2", "description2", false));
		todoItemRepo.save(new TodoItem("title3", "description3", false));

		for (var todoItemRepo : todoItemRepo.findAll()) {
			logger.info(todoItemRepo.getTitle());
		}
	}

}
