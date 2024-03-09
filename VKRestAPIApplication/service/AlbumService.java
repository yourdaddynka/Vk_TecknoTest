package com.vk.restapi.VKRestAPIApplication.old.service;

import com.vk.restapi.VKRestAPIApplication.models.Album;

import java.util.List;
import java.util.Optional;

public interface AlbumService {
    public List<Album> findAll();

    public List<Album> pushAll(List<Album> album);

    public Optional<Album> save(Album album);

    public Optional<Album> findById(Long idAlbum);

    public Optional<Album> update(Album album);

    public void remove(Long idAlbum);
}
