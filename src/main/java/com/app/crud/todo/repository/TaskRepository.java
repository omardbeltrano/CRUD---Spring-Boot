package com.app.crud.todo.repository;

import com.app.crud.todo.entity.Todo;
import com.app.crud.todo.service.Task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Todo, Long>{

}
