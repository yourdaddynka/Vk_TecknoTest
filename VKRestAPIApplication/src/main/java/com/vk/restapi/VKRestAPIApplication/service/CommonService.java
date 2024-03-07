package com.vk.restapi.VKRestAPIApplication.service;

import java.util.List;
import java.util.Optional;

public interface CommonService<T, ID> {
    public List<T> findAll();

    public T save(T type);

    public Optional<T> findById(ID id);

    public Optional<T> update(T type);

    public void remove(ID id);
}
