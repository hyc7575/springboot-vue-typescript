package com.example.controller;

import com.example.repository.Todo;
import com.example.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/todos", produces = "application/json; charset=UTF-8")
public class TodoController {
    @Autowired
    public TodoService todoService;

    @GetMapping
    public List<Todo> fetch() {
        return todoService.getTodoList();
    }

    @PostMapping
    public Todo insert(@RequestBody Todo todo) {
        return todoService.insertTodo(todo);
    }

    @PutMapping("/{id}")
    public Todo update(@PathVariable Long id, @RequestBody Todo todo) {
        return todoService.updateTodo(todo);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Long id) {
        return todoService.deleteTodo(id);
    }
}
