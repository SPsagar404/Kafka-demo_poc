package com.demo.kafkademopoc.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "test-topic", groupId = "demo-group")
    public void listen(String message) {
        System.out.println("Received: " + message);
    }
}
