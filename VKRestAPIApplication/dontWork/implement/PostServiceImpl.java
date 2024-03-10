//package com.vk.restapi.VKRestAPIApplication.service.implement;
//
//
//import com.vk.restapi.VKRestAPIApplication.models.Post;
//import com.vk.restapi.VKRestAPIApplication.repository.PostRepository;
//import com.vk.restapi.VKRestAPIApplication.service.CommonService;
//import jakarta.transaction.Transactional;
//import lombok.AllArgsConstructor;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//@AllArgsConstructor
//@Primary
//public class PostServiceImpl implements CommonService<Post, Long> {
//
//    private final PostRepository repository;
//
//    @Override
//    public List<Post> findAll() {
//        return repository.findAll();
//    }
//
//    @Override
//    public Post save(Post post) {
//        return repository.save(post);
//    }
//
//    @Override
//    public Optional<Post> findById(Long id) {
//        return repository.findById(id);
//    }
//
//    @Override
//    public Optional<Post> update(Post post) {
//        return Optional.of(repository.save(post));
//    }
//
//    @Override
//    @Transactional
//    public void remove(Long id) {
//        repository.deleteById(id);
//    }
//}
