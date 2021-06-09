package com.kafka.demo.applications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class ClientConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(ClientConsumerApp.class, args);
    }
}
