package com.example.demo.service;

import com.example.demo.models.TestResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {

    @Value("${randomUser.url}")
    private String randomUserUrl;

    public TestResponse testExecute() throws JsonProcessingException {

        String result = getRandomUser();
        ObjectMapper objectMapper = new ObjectMapper();
        TestResponse testResponse = objectMapper.readValue(result, TestResponse.class);

        return testResponse;
    }

    private String getRandomUser() {

        final String uri = randomUserUrl;
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        return result;
    }
}
