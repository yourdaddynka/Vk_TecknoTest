package com.vk.restapi.VKRestAPIApplication.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;


@RestController
@RequestMapping("/api/v1/proxy")
@AllArgsConstructor
public class JsonPlaceholderProxyController {
    private final static String URL = "https://jsonplaceholder.typicode.com/";

    private final RestTemplate restTemplate;

    @GetMapping("/welcome") public String Welcome(){return "<h2>Welcome to the unprotected page</h2>";}

    private ResponseEntity<String> getEntityById(String entityUrl, Long id) {
        UriComponents uri = UriComponentsBuilder.fromHttpUrl(entityUrl).pathSegment(id.toString()).build();
        return restTemplate.getForEntity(uri.toUriString(),String.class);
    }

    @GetMapping(value = "/comments", params = "postId")
    public ResponseEntity<String> getCommentsByPostId(@RequestParam("postId") Long postId) {
        UriComponents uri = UriComponentsBuilder.fromHttpUrl(URL + "comments").queryParam("postId", postId).build();
        return restTemplate.getForEntity(uri.toUriString(), String.class);
    }

    @GetMapping("/posts/{id}/comments")
    public ResponseEntity<String> getCommentsFromPost(@PathVariable("id") Long id) {return getCommentsByPostId(id);}

    @GetMapping(value = "/posts", params = "userId")
    public ResponseEntity<String> getPostsByUserId(@RequestParam("userId") Long userId) {
        UriComponents uri = UriComponentsBuilder.fromHttpUrl(URL + "posts").queryParam("userId", userId).build();
        return restTemplate.getForEntity(uri.toUriString(), String.class);
    }

    @GetMapping(value = "/comments", params = "userId")
    public ResponseEntity<String> getCommentsByUserId(@RequestParam("userId") Long userId) {
        UriComponents uri = UriComponentsBuilder.fromHttpUrl(URL + "comments").queryParam("userId", userId).build();
        return restTemplate.getForEntity(uri.toUriString(), String.class);
    }


    @GetMapping("/users")
    public ResponseEntity<String> getUsers(){return restTemplate.getForEntity(URL + "users", String.class);}
    @PostMapping("/users/save")
    public ResponseEntity<String> saveUser(@RequestBody String type) {return restTemplate.postForEntity(URL+"users",type,String.class);}
    @GetMapping("/users/{id}")
    public ResponseEntity<String> findByIdUser(@PathVariable("id") Long id) {return getEntityById(URL+"users",id);}
    @PutMapping("/users/update")
    public ResponseEntity<String> updateUser(@RequestBody String type){return restTemplate.postForEntity(URL+"users",type,String.class);}
    @DeleteMapping("/users/delete/{id}")
    public void removeUser(@PathVariable("id") Long id){restTemplate.delete(URL+"users/"+id);}


    @GetMapping("/posts")
    public ResponseEntity<String> getPost(){return restTemplate.getForEntity(URL + "posts", String.class);}
    @PostMapping("/posts/save")
    public ResponseEntity<String> savePost(@RequestBody String type) {return restTemplate.postForEntity(URL+"posts",type,String.class);}
    @GetMapping("/posts/{id}")
    public ResponseEntity<String> findByIdPost(@PathVariable("id") Long id) {return getEntityById(URL+"posts",id);}
    @PutMapping("/posts/update")
    public ResponseEntity<String> updatePost(@RequestBody String type){return restTemplate.postForEntity(URL+"posts",type,String.class);}
    @DeleteMapping("/posts/delete/{id}")
    public void removePost(@PathVariable("id") Long id){restTemplate.delete(URL+"posts/"+id);}



    @GetMapping("/albums")
    public ResponseEntity<String> getAlbum(){return restTemplate.getForEntity(URL + "albums", String.class);}
    @PostMapping("/albums/save")
    public ResponseEntity<String> saveAlbum(@RequestBody String type) {return restTemplate.postForEntity(URL+"albums",type,String.class);}
    @GetMapping("/albums/{id}")
    public ResponseEntity<String> findByIdAlbum(@PathVariable("id") Long id) {return getEntityById(URL+"albums",id);}
    @PutMapping("/albums/update")
    public ResponseEntity<String> updateAlbum(@RequestBody String type){return restTemplate.postForEntity(URL+"albums",type,String.class);}
    @DeleteMapping("/albums/delete/{id}")
    public void removeAlbum(@PathVariable("id") Long id){restTemplate.delete(URL+"albums/"+id);}



    @GetMapping("/photos")
    public ResponseEntity<String> getPhoto(){return restTemplate.getForEntity(URL + "photos", String.class);}
    @PostMapping("/photos/save")
    public ResponseEntity<String> savePhoto(@RequestBody String type) {return restTemplate.postForEntity(URL+"photos",type,String.class);}
    @GetMapping("/photos/{id}")
    public ResponseEntity<String> findByIdPhoto(@PathVariable("id") Long id) {return getEntityById(URL+"photos",id);}
    @PutMapping("/photos/update")
    public ResponseEntity<String> updatePhoto(@RequestBody String type){return restTemplate.postForEntity(URL+"photos",type,String.class);}
    @DeleteMapping("/photos/delete/{id}")
    public void removePhoto(@PathVariable("id") Long id){restTemplate.delete(URL+"photos/"+id);}



    @GetMapping("/comments")
    public ResponseEntity<String> getComment(){return restTemplate.getForEntity(URL + "comments", String.class);}
    @PostMapping("/comments/save")
    public ResponseEntity<String> saveComment(@RequestBody String type) {return restTemplate.postForEntity(URL+"comments",type,String.class);}
    @GetMapping("/comments/{id}")
    public ResponseEntity<String> findByIdComment(@PathVariable("id") Long id) {return getEntityById(URL+"comments",id);}
    @PutMapping("/comments/update")
    public ResponseEntity<String> updateComment(@RequestBody String type){return restTemplate.postForEntity(URL+"comments",type,String.class);}
    @DeleteMapping("/comments/delete/{id}")
    public void removeComment(@PathVariable("id") Long id){restTemplate.delete(URL+"comments/"+id);}


    @GetMapping("/todos")
    public ResponseEntity<String> getTodo(){return restTemplate.getForEntity(URL + "todos", String.class);}
    @PostMapping("/todos/save")
    public ResponseEntity<String> saveTodo(@RequestBody String type) {return restTemplate.postForEntity(URL+"todos",type,String.class);}
    @GetMapping("/todos/{id}")
    public ResponseEntity<String> findByIdTodo(@PathVariable("id") Long id) {return getEntityById(URL+"todos",id);}
    @PutMapping("/todos/update")
    public ResponseEntity<String> updateTodo(@RequestBody String type){return restTemplate.postForEntity(URL+"todos",type,String.class);}
    @DeleteMapping("/todos/delete/{id}")
    public void removeTodo(@PathVariable("id") Long id){restTemplate.delete(URL+"todos/"+id);}

}