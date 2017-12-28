package com.example.service;

import com.example.repository.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getTodoList();

    Todo insertTodo(Todo todo);

    Todo updateTodo(Todo todo);

    boolean deleteTodo(Long id);
}
