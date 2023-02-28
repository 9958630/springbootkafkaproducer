package com.kafka.springbootkafkaproducer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;


    public void publishMessageToKafka(String message){
        kafkaTemplate.send("test1",message);
    }
}
