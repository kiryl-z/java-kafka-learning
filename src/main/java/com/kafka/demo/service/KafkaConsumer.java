package com.kafka.demo.service;

import com.kafka.demo.models.Client;
import com.kafka.demo.models.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    private static final String topic_client = "${spring.kafka.topics.client}";
    private static final String topic_transaction = "${spring.kafka.topics.}";
    private static final String group_id = "${spring.kafka.consumer.group-id}";

//    @Autowired
//    private KafkaTemplate<String, Client> clientTemplate;

    @KafkaListener(topics = topic_client, groupId = group_id)
    public void consume(Client client) {
        logger.info(String.format("#### -> Consumed message -> %s", client.getContent()));
        System.out.println(client.getContent());
    }

//    @KafkaListener(topics = topic_transaction, groupId = group_id)
//    public void consume(Transaction transaction) {
//        logger.info(String.format("#### -> Consumed message -> %s", transaction.getBank());
//        System.out.println(transaction.getBank());
//    }

}
