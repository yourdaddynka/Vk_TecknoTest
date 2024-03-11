package com.vk.restapi.VKRestAPIApplication.config.aspect.aspects;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoggingAspectsRepository extends JpaRepository<Logging, Long> {
}
