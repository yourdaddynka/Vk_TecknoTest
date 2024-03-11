package com.vk.restapi.VKRestAPIApplication.krud.service.implement;

import com.vk.restapi.VKRestAPIApplication.krud.service.EntityService;
import com.vk.restapi.VKRestAPIApplication.models.Post;
import com.vk.restapi.VKRestAPIApplication.krud.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Primary
public class PostServiceImpl implements EntityService<Post> {

    private final PostRepository repository;

    @Override
    public List<Post> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Post> pushAll(List<Post> post) {
        return repository.saveAll(post);
    }

    @Override
    public Optional<Post> save(Post post) {
        return Optional.of(repository.save(post));
    }

    @Override
    public Optional<Post> findById(Long idPost) {
        return repository.findById(idPost);
    }

    @Override
    public Optional<Post> update(Post post) {
        return Optional.of(repository.save(post));
    }

    @Override
    public void remove(Long idPost) {
        repository.deleteById(idPost);
    }
}