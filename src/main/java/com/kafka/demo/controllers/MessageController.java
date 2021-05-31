package com.kafka.demo.controllers;

import com.kafka.demo.models.Client;
import com.kafka.demo.models.Transaction;
import com.kafka.demo.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    private KafkaProducer sendToKafka;
//annotation ensures that HTTP POST requests to /kafka are mapped to the MessageBody class.
// @requestbody converts the message to java json format
    @Autowired
    MessageController(KafkaProducer sendToKafka) {
        this.sendToKafka = sendToKafka;
    }

    @PostMapping("/client")
    public String postController(@RequestBody Client client) {
        this.sendToKafka.SendMessage(client);
        return "200";
    }

    @PostMapping("/transaction")
    public String postController(@RequestBody Transaction transaction) {
        this.sendToKafka.SendMessage(transaction);
        return "200";
    }

}
