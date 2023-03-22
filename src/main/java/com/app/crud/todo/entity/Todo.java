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
	
	@Column(name = "date_task", nullable = false)
	//Pay attention with type of date's library
	private Date dateTask;
	
	//Empty constructor to Java beans
	public Todo() {
		
	}

	public Todo(Long id, String task, Date dateTask) {
		Id = id;
		this.task = task;
		this.dateTask = dateTask;
	}
	
	public Todo(String task, Date dateTask) {
		this.task = task;
		this.dateTask = dateTask;
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

	public Date getDateTask() {
		return dateTask;
	}

	public void setDateTask(Date dateTask) {
		this.dateTask = dateTask;
	}

	@Override
	public String toString() {
		return "Todo [Id=" + Id + ", task=" + task + ", dateTask=" + dateTask + "]";
	}
	
	
	
	
}
