package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Marks this class as a REST controller
@RequestMapping("/api")  // Base URL for all endpoints in this class
public class HelloController {

    @GetMapping("/hello")  // Handles GET requests at /api/hello
    public String sayHello() {
        return "Hello, Spring Boot! 🚀";
    }
    @GetMapping("/")
    public String home() {
    return "Welcome to the homepage!";
}

}
