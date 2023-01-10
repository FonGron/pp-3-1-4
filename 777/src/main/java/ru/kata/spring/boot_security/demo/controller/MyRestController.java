package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.RoleService;
import ru.kata.spring.boot_security.demo.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    private final UserService userService;
    private final RoleService roleService;
    public MyRestController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping(value = "/admin")
    public List<User> showAllUsers() {
        List<User> allUsers = userService.getAllUsers();
        return allUsers;
    }
    @GetMapping(value = "/admin/{id}")
    public User showUser(@PathVariable Long id) {
        User user = userService.getUserById(id);
        return user;
    }
}
