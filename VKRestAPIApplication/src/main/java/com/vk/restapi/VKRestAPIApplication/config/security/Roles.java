package com.vk.restapi.VKRestAPIApplication.config.security;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String role;
    @Column(unique = true) private String name;
    private String password;
}
