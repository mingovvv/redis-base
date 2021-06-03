package com.devyu.redis.model;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Getter
@RedisHash
public class UserDto {

    @Id
    private Long id;
    private String userId;
    private String passwod;
    private String gender;
    private String age;

}
