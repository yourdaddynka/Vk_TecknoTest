package com.vk.restapi.VKRestAPIApplication.service.implement;

import com.vk.restapi.VKRestAPIApplication.models.Album;
import com.vk.restapi.VKRestAPIApplication.repository.AlbumRepository;
import com.vk.restapi.VKRestAPIApplication.service.CommonService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Primary
public class AlbumServiceImpl implements CommonService<Album, Long> {

    private final AlbumRepository repository;

    @Override
    public List<Album> findAll() {
        return repository.findAll();
    }

    @Override
    public Album save(Album type) {
        return repository.save(type);
    }

    @Override
    public Optional<Album> findById(Long aLong) {
        return repository.findById(aLong);
    }

    @Override
    public Optional<Album> update(Album type) {
        return Optional.of(repository.save(type));
    }

    @Override
    public void remove(Long aLong) {
        repository.deleteById(aLong);
    }
}
