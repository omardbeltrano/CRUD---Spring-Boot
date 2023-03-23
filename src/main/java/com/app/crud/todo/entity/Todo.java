package com.app.crud.todo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//Assign table name
@Table(name = "todo")
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "task", nullable = false, length = 50)
	private String task;
	
	@Column(name = "description", nullable = false, length = 100)
	//Pay attention with type of date's library
	private String description ;
	
	@Column(name = "date", nullable = false)
	private String date;
	
	//Empty constructor to Java beans
	public Todo() {
		
	}

	public Todo(Long id, String task, String description, String date) {
		Id = id;
		this.task = task;
		this.description = description;
		this.date = date;
	}
	
	public Todo(String task, String description, String date) {
		this.task = task;
		this.description = description;
		this.date = date;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Todo [Id=" + Id + ", task=" + task + ", description=" + description + "date" + date + "]";
	}
	
	
	
	
}
