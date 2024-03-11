package com.vk.restapi.VKRestAPIApplication.config.aspect.aspects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


import java.time.LocalDateTime;

@Entity
@Data
public class Logging {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime currentDateTime;
    private String username;
    private String methodName;
    private String parameters;
    private String ip;

    public Logging(LocalDateTime currentDateTime, String username, String methodName, String parameters, String ip) {
        this.currentDateTime = currentDateTime;
        this.username = username;
        this.methodName = methodName;
        this.parameters = parameters;
        this.ip = ip;
    }

    public Logging() {

    }
}
