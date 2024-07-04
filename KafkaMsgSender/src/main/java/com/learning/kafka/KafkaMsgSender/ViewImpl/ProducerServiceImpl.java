package com.learning.kafka.KafkaMsgSender.ViewImpl;


public interface ProducerServiceImpl {

    public void sendMessage(String topic, String message);
}
