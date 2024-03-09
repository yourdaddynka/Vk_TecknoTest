package com.vk.restapi.VKRestAPIApplication.old.service;

import com.vk.restapi.VKRestAPIApplication.models.user.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<User> findAll();

    public List<User> pushAll(List<User> users);

    public Optional<User> save(User user);

    public Optional<User> findById(Long idUser);

    public Optional<User> update(User user);

    public void remove(Long idUser);
}
