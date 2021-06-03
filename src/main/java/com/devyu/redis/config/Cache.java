package com.devyu.redis.config;

import lombok.Getter;

@Getter
public enum Cache {

    TEST_A("testA", 10),
    TEST_B("testB", 30);

    private final String key;
    private final int ttl;

    Cache(String key, int ttl) {
        this.key = key;
        this.ttl = ttl;
    }

}
