package com.learning.kafka.KafkaMsgReceiver.Service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMsgReceiverService {

    @KafkaListener(topics = "conversation", groupId = "myGroup")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}
