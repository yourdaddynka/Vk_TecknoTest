package com.vk.restapi.VKRestAPIApplication.service.implement;

import com.vk.restapi.VKRestAPIApplication.models.user.User;
import com.vk.restapi.VKRestAPIApplication.repository.UserRepository;
import com.vk.restapi.VKRestAPIApplication.service.CommonService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
@Primary
public class UserServiceImpl implements CommonService<User, Long> {

    private final UserRepository repository;

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Optional<User> update(User user) {
        return Optional.of(repository.save(user));
    }

    @Override
    @Transactional
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
