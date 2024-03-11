package com.vk.restapi.VKRestAPIApplication.krud.service.implement;

import com.vk.restapi.VKRestAPIApplication.krud.service.EntityService;
import com.vk.restapi.VKRestAPIApplication.models.Todo;
import com.vk.restapi.VKRestAPIApplication.krud.repository.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Primary
public class TodoServiceImpl implements EntityService<Todo> {

    private final TodoRepository repository;

    @Override
    public List<Todo> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Todo> pushAll(List<Todo> todo) {
        return repository.saveAll(todo);
    }

    @Override
    public Optional<Todo> save(Todo todo) {
        return Optional.of(repository.save(todo));
    }

    @Override
    public Optional<Todo> findById(Long idTodo) {
        return repository.findById(idTodo);
    }

    @Override
    public Optional<Todo> update(Todo todo) {
        return Optional.of(repository.save(todo));
    }

    @Override
    public void remove(Long idTodo) {
        repository.deleteById(idTodo);
    }
}
