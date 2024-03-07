package com.vk.restapi.VKRestAPIApplication.service.implement;

import com.vk.restapi.VKRestAPIApplication.models.Photo;
import com.vk.restapi.VKRestAPIApplication.repository.PhotoRepository;
import com.vk.restapi.VKRestAPIApplication.service.CommonService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Primary
public class PhotoServiceImpl implements CommonService<Photo, Long> {
    private final PhotoRepository repository;


    @Override
    public List<Photo> findAll() {
        return repository.findAll();
    }

    @Override
    public Photo save(Photo type) {
        return repository.save(type);
    }

    @Override
    public Optional<Photo> findById(Long aLong) {
        return repository.findById(aLong);
    }

    @Override
    public Optional<Photo> update(Photo type) {
        return Optional.of(repository.save(type));
    }

    @Override
    public void remove(Long aLong) {
        repository.deleteById(aLong);
    }
}
