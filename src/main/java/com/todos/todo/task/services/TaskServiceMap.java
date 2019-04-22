package com.todos.todo.task.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.todos.todo.task.domain.Task;
import com.todos.todo.task.domain.TaskStatus;
import com.todos.todo.task.repository.TaskRepository;

import org.springframework.stereotype.Service;

@Service
public class TaskServiceMap implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceMap(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> findAll() {
        List<Task> allTasks = new ArrayList<>();
        taskRepository.findAll().forEach(allTasks::add);
        return allTasks;
    }

    @Override
    public List<Task> findByType(TaskStatus status) {
        return new ArrayList<>(taskRepository.findByTaskStatus(status));
    }

    @Override
    public Task findById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    public void addNewTask(Task task) {
        taskRepository.save(task);
    }

    @Override
    public void deleteTask(Task task) {
        taskRepository.delete(task);
    }

    @Override
    public void changeTaskType(Long id, TaskStatus status) {
        Task task = taskRepository.findById(id).orElse(null);
        if (task != null) {
            task.setTaskStatus(status);
            taskRepository.save(task);
        }
    }

}