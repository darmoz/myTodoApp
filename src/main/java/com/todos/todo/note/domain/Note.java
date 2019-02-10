package com.todos.todo.note.domain;

import com.todos.todo.task.domain.Task;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String note;

    @OneToOne
    private Task task;
}
