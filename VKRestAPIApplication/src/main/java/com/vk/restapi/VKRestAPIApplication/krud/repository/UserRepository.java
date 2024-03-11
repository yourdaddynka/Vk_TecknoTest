package com.vk.restapi.VKRestAPIApplication.krud.repository;

import com.vk.restapi.VKRestAPIApplication.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
