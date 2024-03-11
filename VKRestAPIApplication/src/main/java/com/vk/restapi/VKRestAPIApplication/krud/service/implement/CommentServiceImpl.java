package com.vk.restapi.VKRestAPIApplication.krud.service.implement;

import com.vk.restapi.VKRestAPIApplication.krud.service.EntityService;
import com.vk.restapi.VKRestAPIApplication.models.Comment;
import com.vk.restapi.VKRestAPIApplication.krud.repository.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Primary
public class CommentServiceImpl implements EntityService<Comment> {
    private final CommentRepository repository;

    @Override
    public List<Comment> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Comment> pushAll(List<Comment> comment) {
        return repository.saveAll(comment);
    }

    @Override
    public Optional<Comment> save(Comment comment) {
        return Optional.of(repository.save(comment));
    }

    @Override
    public Optional<Comment> findById(Long idComment) {
        return repository.findById(idComment);
    }

    @Override
    public Optional<Comment> update(Comment comment) {
        return Optional.of(repository.save(comment));
    }

    @Override
    public void remove(Long idComment) {
        repository.deleteById(idComment);
    }
}
