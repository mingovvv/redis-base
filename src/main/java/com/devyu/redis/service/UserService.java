package com.devyu.redis.service;

import com.devyu.redis.model.User;
import com.devyu.redis.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;

    @Cacheable(value = "users", key = "'all'")
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
