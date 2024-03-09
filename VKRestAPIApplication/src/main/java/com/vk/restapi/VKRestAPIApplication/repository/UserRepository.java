package com.vk.restapi.VKRestAPIApplication.repository;

import com.vk.restapi.VKRestAPIApplication.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
}
