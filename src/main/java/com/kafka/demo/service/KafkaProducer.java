package com.kafka.demo.service;

import com.kafka.demo.models.MessageBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);

    @Value("${spring.kafka.topic.name}")
    private String topic;

    @Autowired
    private KafkaTemplate<String, MessageBody> kafkaTemplate;

    public void SendMessage(MessageBody message) {
        logger.info(String.format("#### -> Producing message -> %s", message.getContent()));
        this.kafkaTemplate.send(topic, message);
    }
}
