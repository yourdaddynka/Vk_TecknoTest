package com.vk.restapi.VKRestAPIApplication.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateCreate {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
