package com.vk.restapi.VKRestAPIApplication.config.aspect.aspects;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
@Primary
public class LoggingAspectsServiceImpl implements LoggingAspectsService<Logging> {
    private final LoggingAspectsRepository repository;

    @Override
    public Optional<Logging> save(Logging entity) {
        return Optional.of(repository.save(entity));
    }
}
