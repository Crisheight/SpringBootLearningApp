package com.crosa.learning;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/greetings")
    public String sayGreeting() {
        return "Hello from the REST controller";
    }

    @GetMapping("/greetings-2")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String sayGreeting2() {
        return "Hello from the REST controller";
    }

}
