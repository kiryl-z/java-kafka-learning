package com.kafka.demo;

import com.kafka.demo.controllers.MessageController;
import com.kafka.demo.models.Client;
import com.kafka.demo.models.Transaction;
import com.kafka.demo.models.TransactionType;
import com.kafka.demo.service.KafkaProducer;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageControllerUnitTest {

    @Autowired
    private MessageController controller;

    @MockBean
    private KafkaProducer kafkaProducer;

    @Test
    public void testClientPostRequest_positive() {

        Client message = new Client(999, "test");
        String response = controller.postController(message);
        assertEquals("200", response);
    }

    @Test
    public void testTransactionPostRequest_positive() {
        String date = "2021-05-31T00:00:00";
        LocalDateTime localDate = LocalDateTime.parse(date);
        Transaction message = new Transaction("bank", 999L, TransactionType.INCOME, 999, 2.2, localDate);
        String response = controller.postController(message);
        assertEquals("200", response);
    }


}
