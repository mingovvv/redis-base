package com.devyu.redis.repository;

import com.devyu.redis.model.UserDto;
import org.springframework.data.repository.CrudRepository;

public interface RedisRepository extends CrudRepository<UserDto, String> {
}
