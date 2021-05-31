package com.kafka.demo.service;

import com.kafka.demo.models.Client;
import com.kafka.demo.models.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);

    @Value("${spring.kafka.topics.client}")
    private String clientTopic;

    @Value("${spring.kafka.topics.transaction}")
    private String transactionTopic;

    @Autowired
    private KafkaTemplate<String, Client> clientTemplate;

    @Autowired
    private KafkaTemplate<String, Transaction> transactionTemplate;

    public void SendMessage(Client message) {
        logger.info(String.format("#### -> Producing client data: %s", message.getContent()));
        this.clientTemplate.send(clientTopic, message);
    }

    public void SendMessage(Transaction message) {
        logger.info(String.format("#### -> Producing transaction for a client with id: %s", message.getClientId()));
        this.transactionTemplate.send(transactionTopic, message);
    }
}
