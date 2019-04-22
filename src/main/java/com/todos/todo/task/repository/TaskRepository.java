package com.todos.todo.task.repository;

import com.todos.todo.task.domain.Task;
import com.todos.todo.task.domain.TaskStatus;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskRepository extends CrudRepository<Task, Long> {

    List<Task> findByType(TaskStatus status);
}
