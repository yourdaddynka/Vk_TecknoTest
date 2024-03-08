//package com.vk.restapi.VKRestAPIApplication.controller;
//
//import com.vk.restapi.VKRestAPIApplication.models.Post;
//import com.vk.restapi.VKRestAPIApplication.models.user.User;
//import com.vk.restapi.VKRestAPIApplication.service.CommonService;
//import lombok.NonNull;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//ROLE_ADMIN - имеет доступ ко всем обработчикам
//ROLE_POSTS - имеет доступ к обработчикам /posts/**
//ROLE_USERS - имеет доступ к обработчикам /users/**
//ROLE_ALBUMS - имеет доступ к обработчикам /albums/**
//
//@RestController
//@RequestMapping("api/v1/apps/users")
//@RequiredArgsConstructor
//public class UserController {
//    @NonNull CommonService<User,Long> userService;
//
//    @GetMapping("/welcome")
//    public String Welcome(){return "<h2>Welcome to the unprotected page</h2>";}
//
//    @GetMapping
//    public List<User> findAll(){return userService.findAll();}
//
//    @PostMapping("save")
//    public User save(User type){return userService.save(type);}
//
//    @GetMapping("/{id}")
//    public Optional<User> findById(Long id){return userService.findById(id);}
//
//    @PutMapping("update")
//    public Optional<User> update(User type){return userService.update(type);}
//
//    @DeleteMapping("DELETE/")
//    public void remove(Long id){userService.remove(id);}
//
//}
//
///*
//GET	/posts      возвращаем все
//GET	/posts/1    возвращаем отпределенный по айди
//GET	/posts/1/comments
//GET	/comments?postId=1
//POST	/posts
//PUT	/posts/1
//PATCH	/posts/1
//DELETE	/posts/1
//
//
//*/