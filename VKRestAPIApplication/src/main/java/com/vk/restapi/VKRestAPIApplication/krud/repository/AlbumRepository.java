package com.vk.restapi.VKRestAPIApplication.krud.repository;

import com.vk.restapi.VKRestAPIApplication.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
