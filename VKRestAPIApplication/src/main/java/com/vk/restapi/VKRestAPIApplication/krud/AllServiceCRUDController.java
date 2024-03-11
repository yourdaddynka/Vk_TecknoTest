package com.vk.restapi.VKRestAPIApplication.krud;

import com.vk.restapi.VKRestAPIApplication.krud.service.EntityService;
import com.vk.restapi.VKRestAPIApplication.models.*;
import com.vk.restapi.VKRestAPIApplication.models.user.User;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/apps")
public class AllServiceCRUDController {
    @GetMapping("/welcome")
    public String Welcome() {
        return "<h2>Welcome to the unprotected page</h2>";
    }

    @NonNull
    private final EntityService<User> userService;
    @NonNull
    private final EntityService<Post> postService;
    @NonNull
    private final EntityService<Album> albumService;
    @NonNull
    private final EntityService<Photo> photoService;
    @NonNull
    private final EntityService<Comment> commentService;
    @NonNull
    private final EntityService<Todo> todoService;


    @GetMapping("/users")
    public List<User> findAllUser() {
        return userService.findAll();
    }

    @PostMapping("/users/save")
    public User saveUser(@RequestBody User type) {
        return userService.save(type).get();
    }

    @GetMapping("/users/{id}")
    public User findByIdUser(@PathVariable("id") Long id) {
        return userService.findById(id).get();
    }

    @PutMapping("/users/update")
    public User updateUser(@RequestBody User type) {
        return userService.update(type).get();
    }

    @DeleteMapping("/users/delete/{id}")
    public void removeUser(@PathVariable("id") Long id) {
        userService.remove(id);
    }

    @PostMapping(value = "/users/pushall")
    public List<User> saveUserAll(@RequestBody List<User> type) {
        return userService.pushAll(type);
    }


    @GetMapping("/posts")
    public List<Post> findAllPost() {
        return postService.findAll();
    }

    @PostMapping("/posts/save")
    public Post savePost(@RequestBody Post type) {
        return postService.save(type).get();
    }

    @GetMapping("/posts/{id}")
    public Post findByIdPost(@PathVariable("id") Long id) {
        return postService.findById(id).get();
    }

    @PutMapping("/posts/update")
    public Post updatePost(@RequestBody Post type) {
        return postService.update(type).get();
    }

    @DeleteMapping("/posts/delete/{id}")
    public void removePost(@PathVariable("id") Long id) {
        postService.remove(id);
    }

    @PostMapping(value = "/posts/pushall")
    public List<Post> savePostAll(@RequestBody List<Post> type) {
        return postService.pushAll(type);
    }


    @GetMapping("/albums")
    public List<Album> findAllAlbum() {
        return albumService.findAll();
    }

    @PostMapping("/albums/save")
    public Album saveAlbum(@RequestBody Album type) {
        return albumService.save(type).get();
    }

    @GetMapping("/albums/{id}")
    public Album findByIdAlbum(@PathVariable("id") Long id) {
        return albumService.findById(id).get();
    }

    @PutMapping("/albums/update")
    public Album updateAlbum(@RequestBody Album type) {
        return albumService.update(type).get();
    }

    @DeleteMapping("/albums/delete/{id}")
    public void removeAlbum(@PathVariable("id") Long id) {
        albumService.remove(id);
    }

    @PostMapping(value = "/albums/pushall")
    public List<Album> saveAlbumAll(@RequestBody List<Album> type) {
        return albumService.pushAll(type);
    }


    @GetMapping("/photos")
    public List<Photo> findAllPhoto() {
        return photoService.findAll();
    }

    @PostMapping("/photos/save")
    public Photo savePhoto(@RequestBody Photo type) {
        return photoService.save(type).get();
    }

    @GetMapping("/photos/{id}")
    public Photo findByIdPhoto(@PathVariable("id") Long id) {
        return photoService.findById(id).get();
    }

    @PutMapping("/photos/update")
    public Photo updatePhoto(@RequestBody Photo type) {
        return photoService.update(type).get();
    }

    @DeleteMapping("/photos/delete/{id}")
    public void removePhoto(@PathVariable("id") Long id) {
        photoService.remove(id);
    }

    @PostMapping(value = "/photos/pushall")
    public List<Photo> savePhotoAll(@RequestBody List<Photo> type) {
        return photoService.pushAll(type);
    }


    @GetMapping("/comments")
    public List<Comment> findAllComment() {
        return commentService.findAll();
    }

    @PostMapping("/comments/save")
    public Comment saveComment(@RequestBody Comment type) {
        return commentService.save(type).get();
    }

    @GetMapping("/comments/{id}")
    public Comment findByIdComment(@PathVariable("id") Long id) {
        return commentService.findById(id).get();
    }

    @PutMapping("/comments/update")
    public Comment updatePhoto(@RequestBody Comment type) {
        return commentService.update(type).get();
    }

    @DeleteMapping("/comments/delete/{id}")
    public void removeComment(@PathVariable("id") Long id) {
        commentService.remove(id);
    }

    @PostMapping(value = "/comments/pushall")
    public List<Comment> saveCommentAll(@RequestBody List<Comment> type) {
        return commentService.pushAll(type);
    }


    @GetMapping("/todos")
    public List<Todo> findAllTodo() {
        return todoService.findAll();
    }

    @PostMapping("/todos/save")
    public Todo saveTodo(@RequestBody Todo type) {
        return todoService.save(type).get();
    }

    @GetMapping("/todos/{id}")
    public Todo findByIdTodo(@PathVariable("id") Long id) {
        return todoService.findById(id).get();
    }

    @PutMapping("/todos/update")
    public Todo updateTodo(@RequestBody Todo type) {
        return todoService.update(type).get();
    }

    @DeleteMapping("/todos/delete/{id}")
    public void removeTodo(@PathVariable("id") Long id) {
        todoService.remove(id);
    }

    @PostMapping(value = "/todos/pushall")
    public List<Todo> saveTodoAll(@RequestBody List<Todo> type) {
        return todoService.pushAll(type);
    }
}