package com.akh.prac.kafkastream.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SquareConsumer {

    @Value("${kafka.topic.even-output}")
    private String inputTopic;

    @KafkaListener(topics = "${kafka.topic.even-output}"  )
    public void squareConsumer(Long number){

        System.out.println("reading even number "+number);
    }

}
