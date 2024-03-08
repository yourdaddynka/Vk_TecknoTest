package com.vk.restapi.VKRestAPIApplication.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractAuthenticationFilterConfigurer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
//@EnableWebSecurity - весь класс будет применен к глобальной WEB безопасности
//две эти аннотации используются для настройки web-security
public class SecurityController {

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
        UserDetails user = User.builder().username("ROLE_USERS").password(encoder.encode("ROLE_USERS"))
                .roles("ADMIN","USERS").build();
        UserDetails post = User.builder().username("ROLE_POSTS").password(encoder.encode("ROLE_POSTS"))
                .roles("ADMIN","POSTS").build();
        UserDetails photo = User.builder().username("ROLE_PHOTOS").password(encoder.encode("ROLE_PHOTOS"))
                .roles("ADMIN","ALBUMS","PHOTOS").build();
        UserDetails album = User.builder().username("ROLE_ALBUMS").password(encoder.encode("ROLE_ALBUMS"))
                .roles("ADMIN","ALBUMS").build();
        UserDetails comment = User.builder().username("ROLE_COMMENTS").password(encoder.encode("ROLE_COMMENTS"))
                .roles("ADMIN","POSTS","COMMENTS").build();
        UserDetails admin = User.builder().username("ROLE_ADMIN").password(encoder.encode("ROLE_ADMIN"))
                .roles("ADMIN").build();
        return new InMemoryUserDetailsManager(user,post,photo,album,comment,admin);
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(auth -> auth.requestMatchers("api/v1/apps/welcome").permitAll()
                        .requestMatchers("api/v1/apps/**").authenticated())
                .formLogin(AbstractAuthenticationFilterConfigurer::permitAll)
                .build();
    }
}
