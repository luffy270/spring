package com.bingo.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@Controller
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    String helloworld() {
        return "helloworld";
    }

    @RequestMapping("/rest")
    @ResponseBody
    public Map<String, Object> rest() {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("1", "A");
        result.put("2", "B");
        return result;
    }

}
