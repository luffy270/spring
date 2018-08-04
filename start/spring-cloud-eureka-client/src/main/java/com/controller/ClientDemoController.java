package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class ClientDemoController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/client")
    public Map<String,Object> client()
    {
        Map<String,Object> result = restTemplate.getForObject("http://SPRINGBOOTDEMO/test",Map.class);
        return result;
    }

    @RequestMapping("/test")
    public String clienttest()
    {
        String result = restTemplate.getForObject("http://SPRINGBOOTDEMO/server",String.class);
        return result;
    }
}
