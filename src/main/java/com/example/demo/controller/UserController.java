package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.domain.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {

    private UserRepo userRepo;

    @GetMapping("/{id}")
    public List<User> getUser(@PathVariable(name = "id") Long id) {
        User user = new User();
        user.setAge(99);
        user.setName("hejun");
        this.userRepo.save(user);
        return this.userRepo.findAll();
    }
}
