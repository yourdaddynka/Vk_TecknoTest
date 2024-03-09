package com.vk.restapi.VKRestAPIApplication.old.service;

import com.vk.restapi.VKRestAPIApplication.models.Photo;

import java.util.List;
import java.util.Optional;

public interface PhotoService {
    public List<Photo> findAll();

    public List<Photo> pushAll(List<Photo> photo);

    public Optional<Photo> save(Photo photo);

    public Optional<Photo> findById(Long idPhoto);

    public Optional<Photo> update(Photo photo);

    public void remove(Long idPhoto);
}
