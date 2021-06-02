package com.devyu.redis.controller;

import com.devyu.redis.model.User;
import com.devyu.redis.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public String getUsers() {
        List<User> users = userService.findAllUsers();
        return users.toString();
    }
}
