package com.kafka.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

// Doesn't work, just a mockup
@Service
public class KafkaClientConsumer {

    private final Logger logger = LoggerFactory.getLogger(KafkaClientConsumer.class);

    private static final String topic = "${spring.kafka.topics.client}";

//    @Autowired
//    private KafkaTemplate<String, Client> clientTemplate;
//
//    @KafkaListener(topics = topic)
//    public void consume(Client client) {
//        logger.info(String.format("#### -> Consumed message -> %s", client.getContent()));
//    }

}
