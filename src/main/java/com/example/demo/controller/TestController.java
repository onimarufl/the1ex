package com.example.demo.controller;

import com.example.demo.models.TestResponse;
import com.example.demo.service.TestService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/user")
    public TestResponse getUser() throws JsonProcessingException {
        return this.testService.testExecute();
    }

}
