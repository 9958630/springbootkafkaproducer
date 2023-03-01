package com.kafka.springkafka.service;

import com.kafka.springkafka.model.Employee;
import com.kafka.springkafka.model.MyCustomEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl {

    @Autowired
    private KafkaTemplate<String, MyCustomEvent> kafkaTemplateObj;


    public void sendObjTokafka(MyCustomEvent myCustomEvent){
        kafkaTemplateObj.send("testobj",myCustomEvent);
    }
}
