package com.vk.restapi.VKRestAPIApplication.krud.service.implement;

import com.vk.restapi.VKRestAPIApplication.krud.service.EntityService;
import com.vk.restapi.VKRestAPIApplication.models.Album;
import com.vk.restapi.VKRestAPIApplication.krud.repository.AlbumRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Primary
public class AlbumServiceImpl implements EntityService<Album> {
    private final AlbumRepository repository;

    @Override
    public List<Album> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Album> pushAll(List<Album> album) {
        return repository.saveAll(album);
    }

    @Override
    public Optional<Album> save(Album album) {
        return Optional.of(repository.save(album));
    }

    @Override
    public Optional<Album> findById(Long idAlbum) {
        return repository.findById(idAlbum);
    }

    @Override
    public Optional<Album> update(Album album) {
        return Optional.of(repository.save(album));
    }

    @Override
    public void remove(Long idAlbum) {
        repository.deleteById(idAlbum);
    }
}
