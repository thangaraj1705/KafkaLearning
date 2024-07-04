package com.learning.kafka.KafkaMsgSender.Service;

import com.learning.kafka.KafkaMsgSender.ViewImpl.ProducerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService implements ProducerServiceImpl {


    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public ProducerService(KafkaTemplate<String, String> kafkaTemplate) {

        this.kafkaTemplate = kafkaTemplate;
    }


    @Override
    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic,message);

    }
}
