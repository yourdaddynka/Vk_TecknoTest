package com.vk.restapi.VKRestAPIApplication.old.service.implement;

import com.vk.restapi.VKRestAPIApplication.models.Album;
import com.vk.restapi.VKRestAPIApplication.old.service.AlbumService;
import com.vk.restapi.VKRestAPIApplication.repository.AlbumRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Primary
public class AlbumServiceImpl implements AlbumService {
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
