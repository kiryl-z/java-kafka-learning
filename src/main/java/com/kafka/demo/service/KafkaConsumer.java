package com.kafka.demo.service;

import com.kafka.demo.models.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;
// Doesn't work, just a mockup
@Service
public class KafkaConsumer {

    private final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    private static final String topic = "${spring.kafka.topics.client}";

    @KafkaListener(topics = topic)
    public void consume(Client client) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", client.getContent()));
    }

}
