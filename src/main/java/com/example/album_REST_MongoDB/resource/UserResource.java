package com.example.album_REST_MongoDB.resource;

import com.example.album_REST_MongoDB.model.User;
import com.example.album_REST_MongoDB.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/id")
    public User getUserById(@RequestParam(name = "userId") String userId){
        return userService.getUserById(userId);
    }

    @PostMapping
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping
    public String deleteUser(@RequestParam(name = "userId") String userId){
        return userService.deleteUser(userId);
    }
}
