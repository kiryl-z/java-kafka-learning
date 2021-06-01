package com.kafka.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

// Doesn't work, just a mockup
@Service
public class KafkaTransactionConsumer {

    private final Logger logger = LoggerFactory.getLogger(KafkaTransactionConsumer.class);

    private static final String topic = "${spring.kafka.topics.transaction}";

//    @Autowired
//    private KafkaTemplate<String, Transaction> clientTemplate;
//
//    @KafkaListener(topics = topic)
//    public void consume(Transaction transaction) {
//        logger.info(String.format("#### -> Consumed message -> %s", transaction...));
//    }

}
