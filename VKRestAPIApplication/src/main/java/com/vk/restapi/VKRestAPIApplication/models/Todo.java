package com.vk.restapi.VKRestAPIApplication.models;

import jakarta.persistence.*;

import javax.swing.*;

@Entity
public class Todo {
    private Long userId;
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Boolean completed;
}