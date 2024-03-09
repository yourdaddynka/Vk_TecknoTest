package com.vk.restapi.VKRestAPIApplication.models.user;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "geos")
public class Geo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double lat;
    private Double lng;
}