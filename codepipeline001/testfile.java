package com.example.codepipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Testfile {

    @GetMapping("/data")
    public String firstMessage() {
        return "this is the first message from AWS ECS";
    }
}
