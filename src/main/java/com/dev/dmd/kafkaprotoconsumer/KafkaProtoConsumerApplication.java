package com.dev.dmd.kafkaprotoconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class KafkaProtoConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaProtoConsumerApplication.class, args);
    }

}
