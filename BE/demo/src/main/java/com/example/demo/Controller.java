package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/test")
public class Controller {
    @GetMapping
    public String test() {
        return "Hello, World!";
    }

    @GetMapping("/{id}")
    public String getMethodName(@PathVariable int id) {
        return "Hello from id";
    }
    
}
