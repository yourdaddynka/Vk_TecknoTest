package com.vk.restapi.VKRestAPIApplication.repository;

import com.vk.restapi.VKRestAPIApplication.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
