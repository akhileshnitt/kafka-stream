package com.akh.prac.kafkastream.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OddConsumer {
    @Value("${kafka.topic.odd-output}")
    private String inputTopic;

    @KafkaListener(topics = "${kafka.topic.odd-output}"  )
    public void squareConsumer(Long number){

        System.out.println("reading Odd number "+number);
    }
}
