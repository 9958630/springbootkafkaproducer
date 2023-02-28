package com.kafka.springbootkafkaproducer.controller;

import com.kafka.springbootkafkaproducer.model.Employee;
import com.kafka.springbootkafkaproducer.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @PostMapping("/sendEmployee")
    public void sendEmployeeObjects(@RequestBody Employee employee){
        if(Objects.nonNull(employee))
        employeeService.sendObjTokafka(employee);
    }


}