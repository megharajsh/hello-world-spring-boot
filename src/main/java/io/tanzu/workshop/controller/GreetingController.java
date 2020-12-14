package io.tanzu.workshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    // http://localhost:8080/
    @GetMapping(path = "/")
    public String greet() {
        return "Hello World!";
    }
}
