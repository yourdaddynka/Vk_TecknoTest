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
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("api/v1/apps/posts")
//
//public class PostController {
//
//    @NonNull CommonService<Post,Long> postService;
//
//    @GetMapping("/welcome")
//    public String Welcome(){return "<h2>Welcome to the unprotected page</h2>";}
//
//    @GetMapping
//    public List<Post> findAll(){return postService.findAll();}
//
//    @PostMapping("save")
//    public User save(Post type){return postService.save(type);}
//
//    @GetMapping("/{id}")
//    public Optional<Post> findById(Long id){return postService.findById(id);}
//
//    @PutMapping("update")
//    public Optional<User> update(User type){return postService.update(type);}
//
//    @DeleteMapping("DELETE/")
//    public void remove(Long id){postService.remove(id);}
//
//}
