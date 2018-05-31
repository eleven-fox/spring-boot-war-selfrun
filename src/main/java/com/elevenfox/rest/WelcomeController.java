package com.elevenfox.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class WelcomeController {
    @GetMapping
    public String index(){
        return "{\"code\":\"ok\"}";
    }
}
