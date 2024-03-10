package com.vk.restapi.VKRestAPIApplication.old.service.implement;

import com.vk.restapi.VKRestAPIApplication.models.user.User;
import com.vk.restapi.VKRestAPIApplication.old.service.EntityService;
import com.vk.restapi.VKRestAPIApplication.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Primary
public class UserServiceImpl implements EntityService<User> {

    private final UserRepository repository;

    @Override
    public List<User> pushAll(List<User> users) {return repository.saveAll(users);}

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<User> save(User user) {
        return Optional.of(repository.save(user));
    }

    @Override
    public Optional<User> findById(Long idUser) {
        return repository.findById(idUser);
    }

    @Override
    public Optional<User> update(User user) {
        return Optional.of(repository.save(user));
    }

    @Override
    public void remove(Long idUser) {
        repository.deleteById(idUser);
    }

}
