package com.kafka.demo.service;

import com.kafka.demo.models.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;
// Doesn't work, just a mockup
@Service
public class KafkaConsumer {

    private final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    private static final String topic = "${spring.kafka.topics.client}";

//    @Autowired
//    private KafkaTemplate<String, Client> clientTemplate;
//
//    @KafkaListener(topics = topic)
//    public void consume(Client client) {
//        logger.info(String.format("#### -> Consumed message -> %s", client.getContent()));
//    }

}
