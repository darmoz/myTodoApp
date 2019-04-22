package com.todos.todo.task.services;

import java.util.List;

import com.todos.todo.task.domain.Task;
import com.todos.todo.task.domain.TaskStatus;

public interface TaskService {

    List<Task> findAll();

    List<Task> findByType(TaskStatus status);

    Task findById(Long Id);

    void addNewTask(Task task);

    void deleteTask(Task task);

    void changeTaskType(Long id, TaskStatus status);

}