package com.nexos.inventary.controller;

import com.nexos.inventary.model.dto.UserDto;
import com.nexos.inventary.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

        private final UserServices userServices;

        @Autowired
    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @PostMapping(path="/save")
    public UserDto saveUser(@RequestBody UserDto user){

            return userServices.saveUser(user);
    }
}
