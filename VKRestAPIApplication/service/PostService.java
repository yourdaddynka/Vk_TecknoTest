package com.vk.restapi.VKRestAPIApplication.old.service;

import com.vk.restapi.VKRestAPIApplication.models.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    public List<Post> findAll();

    public List<Post> pushAll(List<Post> post);

    public Optional<Post> save(Post post);

    public Optional<Post> findById(Long idPost);

    public Optional<Post> update(Post post);

    public void remove(Long idPost);
}
