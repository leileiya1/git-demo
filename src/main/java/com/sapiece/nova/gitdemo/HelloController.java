package com.sapiece.nova.gitdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //我没改呀它改的
    @GetMapping("/")
    public String hello() {
        return "Hello Controller";
    }
}
