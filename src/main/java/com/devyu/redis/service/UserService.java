package com.devyu.redis.service;

import com.devyu.redis.config.Cache;
import com.devyu.redis.model.User;
import com.devyu.redis.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;

    @Cacheable(value = "testA", key = "'able'")
    public List<User> findAllUsersByCacheable() {
        log.info("redis에 해당 key가 존재한다면 실행되지 않는 메소드");
        return userRepository.findAll();
    }

    @CachePut(value = "testB", key = "'put'")
    public List<User> findAllUsersByCachePut() {
        log.info("항상 실행되고 cache update");
        return userRepository.findAll();
    }

}
