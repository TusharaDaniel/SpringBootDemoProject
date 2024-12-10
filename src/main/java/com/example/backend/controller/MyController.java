package com.example.backend.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")  // Allow requests from your React frontend
public class MyController {

    @GetMapping("/resources")
    public List<String> getResources() {
        // Simulate some resources that could come from a database
        return Arrays.asList("Resource 1", "Resource 2", "Resource 3");
    }
}
