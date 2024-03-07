package com.vk.restapi.VKRestAPIApplication.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Album {
//    @OneToMany
    private Long userId;
    @Id
    @GeneratedValue
    private Long id;
    private String title;
}
