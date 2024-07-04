package com.learning.kafka.KafkaMsgSender.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class ProducerTopic {

    @Bean
    public NewTopic Topic(){
        return TopicBuilder.name("conversation").build();
    }
}

