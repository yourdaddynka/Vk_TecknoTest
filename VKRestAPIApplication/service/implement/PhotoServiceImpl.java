package com.vk.restapi.VKRestAPIApplication.old.service.implement;

import com.vk.restapi.VKRestAPIApplication.models.Photo;
import com.vk.restapi.VKRestAPIApplication.old.service.PhotoService;
import com.vk.restapi.VKRestAPIApplication.repository.PhotoRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Primary
public class PhotoServiceImpl implements PhotoService {
    private final PhotoRepository repository;


    @Override
    public List<Photo> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Photo> pushAll(List<Photo> photo) {
        return repository.saveAll(photo);
    }

    @Override
    public Optional<Photo> save(Photo photo) {
        return Optional.of(repository.save(photo));
    }

    @Override
    public Optional<Photo> findById(Long idPhoto) {
        return repository.findById(idPhoto);
    }

    @Override
    public Optional<Photo> update(Photo photo) {
        return Optional.of(repository.save(photo));
    }

    @Override
    public void remove(Long idPhoto) {
    repository.deleteById(idPhoto);
    }
}
