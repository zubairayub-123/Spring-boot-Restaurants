package com.zubair.Restaurants.controller;

import com.zubair.Restaurants.model.User;
import com.zubair.Restaurants.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveusers")
    public String saveusers(@RequestBody() List<User> users){
        return userService.saveUsers(users);
    }

    @GetMapping("/getusers")
    public List<User> getusers(){
        return userService.getUsers();
    }

    @GetMapping("/getuser")
    public Optional<User> getuser(@RequestParam("userId") Integer userId){
        return userService.getUser(userId);
    }
}
