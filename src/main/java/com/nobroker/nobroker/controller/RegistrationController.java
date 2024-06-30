package com.nobroker.nobroker.controller;

import com.nobroker.nobroker.entity.User;
import com.nobroker.nobroker.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class RegistrationController {
    private UserService userService;
    @PostMapping("/register")
    public Map<String, String > registerUser(@RequestBody User user){
        User registerUser= userService.registerUser(user);
        return (Map<String, String>) registerUser;
    }
}
