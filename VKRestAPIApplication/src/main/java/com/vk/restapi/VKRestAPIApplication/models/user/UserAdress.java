package com.vk.restapi.VKRestAPIApplication.models.user;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class UserAdress {
    @Id
    @GeneratedValue
    private Long id;
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    @OneToOne
    @JoinColumn(nullable = false)
    private UserGeo geo;
}

