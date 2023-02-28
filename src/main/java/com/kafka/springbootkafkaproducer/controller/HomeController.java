package com.kafka.springbootkafkaproducer.controller;

import com.kafka.springbootkafkaproducer.service.HomeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @Autowired
    private HomeServiceImpl homeService;

    @GetMapping("/getMessage")
    public void getMessage(@RequestParam("message")String message){
        homeService.publishMessageToKafka(message);
    }
}