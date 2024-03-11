package com.vk.restapi.VKRestAPIApplication.config.aspect.aspects;

import java.util.Optional;

public interface LoggingAspectsService<T> {
    Optional<T> save(T entity);
}
