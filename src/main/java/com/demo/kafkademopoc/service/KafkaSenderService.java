package com.demo.kafkademopoc.service;

import com.demo.kafkademopoc.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class KafkaSenderService {

    @Autowired
    private KafkaProducer kafkaProducer;


    @Scheduled(fixedRate = 5000)
    public void sendMessage() {
        kafkaProducer.send("test-topic", "Hello, Kafka!");
        System.out.println("Message sent to Kafka topic: test-topic");
    }

}
