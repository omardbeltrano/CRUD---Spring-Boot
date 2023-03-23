package com.app.crud.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.crud.todo.entity.Todo;
import com.app.crud.todo.service.Task;

@Controller
public class TaskController {
	
	//Service innyection
	@Autowired
	private Task taskService;
	
	Todo todo = new Todo();
	
	@GetMapping(path = {"/tasks"})
	public String taskList(Model model) {
		model.addAttribute("tasks", taskService.allTasks());
		return "index";//This return html task
	}
	
	@GetMapping(path = {"/tasks/newTask"})
	public String createTask(Todo todo, Model model) {
		model.addAttribute("tasks", todo);
		return "newTask";
	}
}
