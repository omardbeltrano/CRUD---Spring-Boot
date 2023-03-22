package com.app.crud.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.crud.todo.service.Task;

@Controller
public class TaskController {
	
	//Service innyection
	@Autowired
	private Task taskService;
	
	
	@GetMapping("/tasks")
	public String taskList(Model model) {
		model.addAttribute("tasks", taskService.allTasks());
		return "task";//This return html task
	}
}
