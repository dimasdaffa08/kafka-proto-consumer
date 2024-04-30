package com.dev.dmd.kafkaprotoconsumer.consumer;

import example.user.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserConsumer {

    @KafkaListener(topics = "${kafka.config.topic-user.topic}", groupId = "${kafka.config.topic-user.group-id}")
    public void listenMessage(ConsumerRecord<String, User> consumerRecord) {
        log.info("Retrieve Message: {} ", consumerRecord.value());
    }
}
