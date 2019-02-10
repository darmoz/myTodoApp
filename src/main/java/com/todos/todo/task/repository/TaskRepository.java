package com.todos.todo.task.repository;

import com.todos.todo.task.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
