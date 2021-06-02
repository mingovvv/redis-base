package com.devyu.redis.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
@ToString
public class User {
    @Id @GeneratedValue
    private Long id;
    private String userId;
    private String passwod;
    private String gender;
    private String age;
}
