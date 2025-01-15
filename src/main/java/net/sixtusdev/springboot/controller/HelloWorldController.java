package net.sixtusdev.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // HTTP GET Request
    // http://localhost:8080/hello to access this method

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

}
