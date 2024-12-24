package com.crosa.learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/greetings")
    public String sayGreeting() {
        return "Hello from the GET request";
    }

    @PostMapping("/post")
    public String post(String message){
        return "Successful POST request. The message is: " + message;
    }
} // End FirstController
