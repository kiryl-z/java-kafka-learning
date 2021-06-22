package com.kafka.demo.controllers;

import com.kafka.demo.models.Client;
import com.kafka.demo.models.Transaction;
import com.kafka.demo.service.KafkaProducer;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    private KafkaProducer sendToKafka;


    @Autowired
    MessageController(KafkaProducer sendToKafka) {
        this.sendToKafka = sendToKafka;
    }
    /** Annotation  @PostMapping ensures that HTTP POST requests to /kafka are mapped to the MessageBody class.*/
    @PostMapping("/client")
    public String postController(@RequestBody Client client) {
        this.sendToKafka.sendMessage(client);
        return "200";
    }

    @PostMapping("/transaction")
    /** @requestbody converts the message to java json format */
    public String postController(@RequestBody Transaction transaction) {
        this.sendToKafka.sendMessage(transaction);
        return "200";
    }

}
