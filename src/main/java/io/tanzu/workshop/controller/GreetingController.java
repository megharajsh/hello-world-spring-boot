package io.tanzu.workshop.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${message}")
    private String message;

    // http://localhost:8080/
    @GetMapping(path = "/")
    public String greet() {
        return message;
    }
}
