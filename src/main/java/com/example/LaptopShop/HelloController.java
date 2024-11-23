package com.example.LaptopShop;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello world Spring Boot";
    }

    @GetMapping("/user")
    public String user() {
        return "only user can see it";
    }

    @GetMapping("/admin")
    public String admin() {
        return "only admin can see it";
    }

}
