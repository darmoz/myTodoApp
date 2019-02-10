package com.todos.todo.note.repository;

import com.todos.todo.note.domain.Note;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note, Long> {
}
