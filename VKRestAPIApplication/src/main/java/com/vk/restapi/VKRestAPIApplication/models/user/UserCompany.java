package com.vk.restapi.VKRestAPIApplication.models.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserCompany {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String catchPhrase;
    private String bs;
}
