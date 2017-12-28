package com.example.service;

import com.example.repository.Todo;
import com.example.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getTodoList () {
        return todoRepository.findAll();
    }

    public Todo insertTodo (Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo updateTodo (Todo todo) {
        return todoRepository.save(todo);
    }

    public boolean deleteTodo (Long id) {
        Todo todo = todoRepository.findOne(id);
        todoRepository.delete(todo);
        if(todoRepository.findOne(id) == null){
            return true;
        }
        return false;
    }
}

