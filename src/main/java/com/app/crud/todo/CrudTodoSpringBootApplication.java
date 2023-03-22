package com.app.crud.todo;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.crud.todo.entity.Todo;
import com.app.crud.todo.repository.TaskRepository;

@SpringBootApplication
public class CrudTodoSpringBootApplication implements CommandLineRunner {

	private final Log LOGGER = LogFactory.getLog(CrudTodoSpringBootApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(CrudTodoSpringBootApplication.class, args);
	}
	
	private final Date currentDate;
	
	@Autowired
	private TaskRepository taskRepository;
	
	

	public CrudTodoSpringBootApplication(@Autowired Date currentDate, TaskRepository taskRepository) {
		this.currentDate = currentDate;
		this.taskRepository = taskRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		Todo task1 = new Todo("New Task", currentDate);
		Todo task2 = new Todo("New Task2", currentDate);
		taskRepository.save(task1);
		taskRepository.save(task2);
	}
	
	//Data base save method
	/*public void saveTaskDataBase() {
		Todo task1 = new Todo("New Task", date);
		Todo task2 = new Todo("New Task2", date);
		
		List<Todo> todoList = Arrays.asList(task1, task2);
		todoList.stream().forEach(taskRepository::save);
	}*/

}
