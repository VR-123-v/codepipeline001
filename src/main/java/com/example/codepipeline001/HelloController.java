package com.example.codepipeline001;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello, CodePipeline!";
    }

       @GetMapping("/message")
    public String home() {
        return "Hello, second message from codepipeline!";
    }
}
