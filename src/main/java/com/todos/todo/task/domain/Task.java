package com.todos.todo.task.domain;

import com.todos.todo.note.domain.Note;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
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
    private TaskStatus status;
    private Integer daysAssigned;
}
