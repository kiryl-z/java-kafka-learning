package com.kafka.demo.controllers;

import com.kafka.demo.models.MessageBody;
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

    @PostMapping("/kafka")
    public String postController(@RequestBody MessageBody messageBody) {
        this.sendToKafka.SendMessage(messageBody.getContent());
        return "200";
    }

}
