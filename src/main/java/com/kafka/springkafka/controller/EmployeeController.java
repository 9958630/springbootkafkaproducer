package com.kafka.springkafka.controller;

import com.kafka.springkafka.model.Employee;
import com.kafka.springkafka.model.MyCustomEvent;
import com.kafka.springkafka.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @PostMapping("/sendEmployee")
    public void sendEmployeeObjects(@RequestBody MyCustomEvent myCustomEvent) {
        if(Objects.nonNull(myCustomEvent))
        employeeService.sendObjTokafka(myCustomEvent);
    }


}
