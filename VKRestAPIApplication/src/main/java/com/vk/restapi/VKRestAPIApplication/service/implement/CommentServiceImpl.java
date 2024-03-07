package com.vk.restapi.VKRestAPIApplication.service.implement;

import com.vk.restapi.VKRestAPIApplication.models.Comment;
import com.vk.restapi.VKRestAPIApplication.repository.CommentRepository;
import com.vk.restapi.VKRestAPIApplication.service.CommonService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Primary
public class CommentServiceImpl implements CommonService<Comment, Long> {
    private final CommentRepository repository;

    @Override
    public List<Comment> findAll() {
        return repository.findAll();
    }

    @Override
    public Comment save(Comment type) {
        return repository.save(type);
    }

    @Override
    public Optional<Comment> findById(Long aLong) {
        return repository.findById(aLong);
    }

    @Override
    public Optional<Comment> update(Comment type) {
        return Optional.empty();
    }

    @Override
    public void remove(Long aLong) {

    }
}
