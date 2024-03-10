package com.vk.restapi.VKRestAPIApplication.old.service;

import com.vk.restapi.VKRestAPIApplication.models.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {
    public List<Todo> findAll();

    public List<Todo> pushAll(List<Todo> todo);

    public Optional<Todo> save(Todo todo);

    public Optional<Todo> findById(Long idTodo);

    public Optional<Todo> update(Todo todo);

    public void remove(Long idTodo);
}
