package com.vk.restapi.VKRestAPIApplication.repository;

import com.vk.restapi.VKRestAPIApplication.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long>{
}
