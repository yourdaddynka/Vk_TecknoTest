package com.vk.restapi.VKRestAPIApplication.controller;

import com.vk.restapi.VKRestAPIApplication.models.Album;
import com.vk.restapi.VKRestAPIApplication.models.Comment;
import com.vk.restapi.VKRestAPIApplication.models.Photo;
import com.vk.restapi.VKRestAPIApplication.models.Post;
import com.vk.restapi.VKRestAPIApplication.models.user.User;
import com.vk.restapi.VKRestAPIApplication.service.CommonService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/apps")
public class AllController {

    @NonNull CommonService<User,Long> userService;
    @NonNull CommonService<Post,Long> postService;
    @NonNull CommonService<Photo,Long> photoService;
    @NonNull CommonService<Album,Long> albumService;
    @NonNull CommonService<Comment,Long> commentService;

    private <T, ID> List<T> findAll(CommonService<T, ID> service) {return service.findAll();}
    private <T, ID> Optional<T> findById(CommonService<T, ID> service, ID id) {return service.findById(id);}
    private <T, ID> Optional<T> update(CommonService<T, ID> service, T type) {return service.update(type);}
    private <T, ID> T save(CommonService<T, ID> service, T type) {return service.save(type);}
    private <T, ID> void remove(CommonService<T, ID> service, ID id) {service.remove(id);}


    @GetMapping("/welcome") public String Welcome(){return "<h2>Welcome to the unprotected page</h2>";}
    @GetMapping public String Welcome2(){return "<h2>Welcome to the unprotected page</h2>";}


    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_USERS')")
    @GetMapping("/users") public List<User> findAllUsers(){return findAll(userService);}
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_USERS')")
    @PostMapping("/users/save") public User saveUsers(User type){return save(userService,type);}
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_USERS')")
    @GetMapping("/users/{id}") public Optional<User> findByIdUsers(@PathVariable Long id){return findById(userService,id);}
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_USERS')")
    @PutMapping("/users/update") public Optional<User> updateUsers(User type){return update(userService,type);}
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_USERS')")
    @DeleteMapping("/users/DELETE/") public void removeUsers(Long id){remove(userService,id);}


    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_POSTS')")
    @GetMapping("/posts") public List<Post> findAllPost(){return findAll(postService);}
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_POSTS')")
    @PostMapping("/posts/save") public Post savePost(Post type){return save(postService,type);}
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_POSTS')")
    @GetMapping("/posts/{id}") public Optional<Post> findByIdPost(@PathVariable Long id){return findById(postService,id);}
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_POSTS')")
    @PutMapping("/posts/update") public Optional<Post> updatePost(Post type){return update(postService,type);}
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_POSTS')")
    @DeleteMapping("/posts/DELETE/") public void removePost(Long id){remove(postService,id);}


    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_ALBUMS')")
    @GetMapping("/albums") public List<Album> findAllAlbum(){return findAll(albumService);}
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_ALBUMS')")
    @PostMapping("/albums/save") public Album saveAlbum(Album type){return save(albumService,type);}
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_ALBUMS')")
    @GetMapping("/albums/{id}") public Optional<Album> findByIdAlbum(@PathVariable Long id){return findById(albumService,id);}
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_ALBUMS')")
    @PutMapping("/albums/update") public Optional<Album> updateAlbum(Album type){return update(albumService,type);}
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_ALBUMS')")
    @DeleteMapping("/albums/DELETE/") public void removeAlbum(Long id){remove(albumService,id);}


    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_PHOTOS') || hasAuthority('ROLE_ALBUMS')")
    @GetMapping("/photos") public List<Photo> findAllPhoto(){return findAll(photoService);}
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_PHOTOS') || hasAuthority('ROLE_ALBUMS')")
    @PostMapping("/photos/save") public Photo savePhoto(Photo type){return save(photoService,type);}
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_PHOTOS') || hasAuthority('ROLE_ALBUMS')")
    @GetMapping("/photos/{id}") public Optional<Photo> findByIdPhoto(@PathVariable Long id){return findById(photoService,id);}
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_PHOTOS') || hasAuthority('ROLE_ALBUMS')")
    @PutMapping("/photos/update") public Optional<Photo> updatePhoto(Photo type){return update(photoService,type);}
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_PHOTOS') || hasAuthority('ROLE_ALBUMS')")
    @DeleteMapping("/photos/DELETE/") public void removePhoto(Long id){remove(photoService,id);}


    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_COMMENTS') || hasAuthority('ROLE_POSTS')")
    @GetMapping("/comments") public List<Comment> findAllComment(){return findAll(commentService);}
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_COMMENTS') || hasAuthority('ROLE_POSTS')")
    @PostMapping("/comments/save") public Comment saveComment(Comment type){return save(commentService,type);}
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_COMMENTS') || hasAuthority('ROLE_POSTS')")
    @GetMapping("/comments/{id}") public Optional<Comment> findByIdComment(@PathVariable Long id){return findById(commentService,id);}
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_COMMENTS') || hasAuthority('ROLE_POSTS')")
    @PutMapping("/comments/update") public Optional<Comment> updateComment(Comment type){return update(commentService,type);}
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_COMMENTS') || hasAuthority('ROLE_POSTS')")
    @DeleteMapping("/comments/DELETE/") public void removeComment(Long id){remove(commentService,id);}
}
