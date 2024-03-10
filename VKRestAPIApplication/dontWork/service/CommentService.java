package com.vk.restapi.VKRestAPIApplication.old.service;

import com.vk.restapi.VKRestAPIApplication.models.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentService {
    public List<Comment> findAll();

    public List<Comment> pushAll(List<Comment> comment);

    public Optional<Comment> save(Comment comment);

    public Optional<Comment> findById(Long idComment);

    public Optional<Comment> update(Comment comment);

    public void remove(Long idComment);
}
