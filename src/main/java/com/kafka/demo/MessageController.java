package com.kafka.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
//annotation ensures that HTTP GET requests to /greeting are mapped to the greeting() method.
    @GetMapping("/messageBody")
    public Message messageBody(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Message(counter.incrementAndGet(), String.format(template, name));
    }
}
