package com.kafka.springbootkafkaproducer.service;

import com.kafka.springbootkafkaproducer.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplateObj;


    public void sendObjTokafka(Employee employee) {
        kafkaTemplateObj.send("test1",employee);
    }
}
