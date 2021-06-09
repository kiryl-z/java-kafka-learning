package com.kafka.demo.service;

import com.kafka.demo.models.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaClientConsumer {

    private final Logger logger = LoggerFactory.getLogger(KafkaClientConsumer.class);

    private static final String topic = "${spring.kafka.topics.client}";
    private static final String group_id = "${spring.kafka.consumer.group-id}";

    @Autowired
    private KafkaTemplate<String, Client> clientTemplate;

    @KafkaListener(topics = topic, groupId = group_id)
    public void consume(Client client) {
        logger.info(String.format("#### -> Consumed message -> %s", client.getContent()));
        System.out.println(client.getContent());
    }

}
