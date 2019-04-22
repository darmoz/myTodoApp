package com.todos.todo.task.domain;

import com.todos.todo.note.domain.Note;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subject;

    @OneToOne(cascade = CascadeType.ALL)
    private Note description;

    private LocalDate creationDate;
    private String category;

    @Enumerated(value = EnumType.STRING)
    private TaskStatus taskStatus;
    private Integer daysAssigned;


    public void updateTaskStatus(TaskStatus status) {
        this.taskStatus = status;
    }
}


