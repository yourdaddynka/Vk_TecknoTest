package com.vk.restapi.VKRestAPIApplication.models.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserGeo {
    @Id

    private Long id;
    private String lat;
    private String lng;
}