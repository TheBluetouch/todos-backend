package com.ja.todosbackend.service;

import com.ja.todosbackend.entity.Todo;

import java.util.List;

public interface TodoService {
    public List<Todo> findAll();

    public Todo findById(int theId);

    public void save(Todo todo);

    public void deleteById(int theId);
}
