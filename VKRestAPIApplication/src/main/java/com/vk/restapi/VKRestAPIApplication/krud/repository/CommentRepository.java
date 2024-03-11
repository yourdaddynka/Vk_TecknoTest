package com.vk.restapi.VKRestAPIApplication.krud.repository;

import com.vk.restapi.VKRestAPIApplication.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
