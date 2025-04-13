package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Marks this class as a REST controller
@RequestMapping("/api")  // Base URL for all endpoints in this class
public class HelloController {

    @GetMapping("/hello")  // Handles GET requests at /api/hello
    public String sayHello() {
        return "Hello, Spring Boot! i made some changes 🚀";
    }
    @GetMapping("/")
    public String home() {
    return "Welcome to the homepage!";
}

}

@RequestMapping("/")  // Base URL for all endpoints in this class
public class HelloController {

    @GetMapping("/hello")  // Handles GET requests at /api/hello
    public String sayHello() {
        return "Hello, user ! How are you today 🚀";
    }
    @GetMapping("/")
    public String home() {
    return " this site is under working please visit few days later";
}
}
