package com.crosa.learning;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping("/greetings")
    public String sayGreeting() {
        return "Hello from the GET request";
    }

    @PostMapping("/post")
    public String post(@RequestBody String message){
        return "Successful POST request. The message is: " + message;
    }

    @PostMapping("/post-order")
    public String post(@RequestBody Order order){
        return "Request successful. The order is: " + order.toString();
    }

    @PostMapping("/post-order-record")
    public String postRecord(@RequestBody OrderRecord order){
        return "Request successful. The order is: " + order.toString();
    }

    @GetMapping("/greetings/{user-name}")
    public String pathVar(
            @PathVariable("user-name") String userName
    ) {
        return "my value = " + userName;
    }

} // End FirstController
