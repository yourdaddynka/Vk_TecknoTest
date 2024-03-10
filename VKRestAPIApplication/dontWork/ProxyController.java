//package com.vk.restapi.VKRestAPIApplication.controller;
//
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.reactive.function.BodyInserters;
//import org.springframework.web.reactive.function.client.WebClient;
//import reactor.core.publisher.Mono;
//
//@RestController
//@RequestMapping("/api/v1/apps/proxy")
//public class ProxyController {
//
//    private final WebClient webClient;
//
//    public ProxyController(WebClient webClient) {
//        this.webClient = webClient;
//    }
//
//    @GetMapping("/posts")
//    public Mono<String> getPosts() {
//        return webClient.get()
//                .uri("https://jsonplaceholder.typicode.com/posts")
//                .retrieve()
//                .bodyToMono(String.class);
//    }
//
//    @PostMapping("/posts")
//    public Mono<String> createPost(@RequestBody String post) {
//        return webClient.post()
//                .uri("https://jsonplaceholder.typicode.com/posts")
//                .body(BodyInserters.fromValue(post))
//                .retrieve()
//                .bodyToMono(String.class);
//    }
//
//}