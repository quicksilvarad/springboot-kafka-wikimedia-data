package com.quicksilvarad.springboot;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Service;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic topic()
    {
        return TopicBuilder.name("wikimedia_change").build();
    }
}
