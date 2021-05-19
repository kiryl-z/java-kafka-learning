package com.kafka.demo.controllers;

import com.kafka.demo.models.MessageBody;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {


//annotation ensures that HTTP GET requests to /greeting are mapped to the greeting() method.
    @PostMapping("/kafka")
    public String postController(@RequestBody MessageBody messageBody) {
        return "200";
    }

}
