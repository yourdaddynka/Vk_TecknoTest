package com.vk.restapi.VKRestAPIApplication.models.user;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    @Column(unique = true)
    private String email;
    @ManyToOne
    @JoinColumn(nullable = false)
    private UserAdress address;

    private String phone;

    private String website;

    @ManyToOne
    @JoinColumn(nullable = false)
    private UserCompany Company;
}
