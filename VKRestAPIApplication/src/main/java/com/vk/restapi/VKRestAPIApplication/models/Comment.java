package com.vk.restapi.VKRestAPIApplication.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Comment {
    private Long postId;
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String body;
}