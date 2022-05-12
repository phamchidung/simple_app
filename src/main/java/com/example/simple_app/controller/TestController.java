package com.example.simple_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String homepage() {
        return "Pham chi Dung";  // Trả về trang index.html
    }
}
