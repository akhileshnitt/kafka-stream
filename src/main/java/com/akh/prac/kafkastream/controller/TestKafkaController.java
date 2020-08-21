package com.akh.prac.kafkastream.controller;

import com.akh.prac.kafkastream.producer.KafkaNumberProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestKafkaController {

    @Autowired
    KafkaNumberProducer kafkaNumberProducer;


    @GetMapping("/greeting")
    public String greeting(){
        kafkaNumberProducer.produce();
        return "Kafka Test";
    }
}
