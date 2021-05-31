package com.devyu.redis.repository;

import com.devyu.redis.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface RedisRepository extends CrudRepository<Person, String> {
}
