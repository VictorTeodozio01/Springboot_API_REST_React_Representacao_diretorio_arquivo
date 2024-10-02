package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    // Mapeia a URL raiz ("/") para o método que retorna "Hello World"
    @GetMapping("/")
    public String home() {
        return "Hello World!";
    }
}