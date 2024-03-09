package com.vk.restapi.VKRestAPIApplication.old.service.implement;

import com.vk.restapi.VKRestAPIApplication.models.Comment;
import com.vk.restapi.VKRestAPIApplication.old.service.CommentService;
import com.vk.restapi.VKRestAPIApplication.repository.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Primary
public class CommentServiceImpl implements CommentService {
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
