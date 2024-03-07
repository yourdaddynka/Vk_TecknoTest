package com.vk.restapi.VKRestAPIApplication.controller;

import com.vk.restapi.VKRestAPIApplication.models.user.User;
import com.vk.restapi.VKRestAPIApplication.service.CommonService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {
    @NonNull
    CommonService<User,Long> service;
    @GetMapping
    public List<User> findAll(){return service.findAll();}
    @PostMapping("save")
    public User save(User type){return service.save(type);}
    @GetMapping("/{id}")
    public Optional<User> findById(Long id){return service.findById(id);}
    @PutMapping("update")
    public Optional<User> update(User type){return service.update(type);}
    @DeleteMapping("DELETE/")
    public void remove(Long id){service.remove(id);}
}


GET	/posts      возвращаем все
GET	/posts/1    возвращаем отпределенный по айди
GET	/posts/1/comments
GET	/comments?postId=1
POST	/posts
PUT	/posts/1
PATCH	/posts/1
DELETE	/posts/1


*/