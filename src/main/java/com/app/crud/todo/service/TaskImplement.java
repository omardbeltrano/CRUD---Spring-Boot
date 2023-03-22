package com.app.crud.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.crud.todo.entity.Todo;
import com.app.crud.todo.repository.TaskRepository;

@Service
public class TaskImplement implements Task {

	//Iny ection of repository
	@Autowired
	private TaskRepository taskRepository;

	@Override
	public List<Todo> allTasks() {
		//Return repository injection with findall() method witch come from JpaRepository extensions
		return taskRepository.findAll();
	}
	
	
}
