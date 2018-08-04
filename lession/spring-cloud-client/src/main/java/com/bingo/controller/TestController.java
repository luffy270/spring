package com.bingo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class TestController {
    @Autowired
    private RestTemplate restTemplate;

            @RequestMapping("/getTest")
            public Map<String,Object> test()
            {
                Map<String,Object> result = restTemplate.getForObject("http://127.0.0.1:8001/helloWorld",Map.class);
                return result;
            }

}
