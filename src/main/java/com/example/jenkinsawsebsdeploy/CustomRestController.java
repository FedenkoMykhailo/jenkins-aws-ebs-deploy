package com.example.jenkinsawsebsdeploy;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class CustomRestController {

    @GetMapping
    public String hello() {
        return "Hello Jenkins";
    }

}
