package com.vk.restapi.VKRestAPIApplication.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Photo {
//    @OneToMany
    private Long albumId;
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;
    private String thumbnailUrl;
}
