package com.bingo.springbootdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@Controller
@ComponentScan("com.bingo")
@EnableDiscoveryClient
public class SpringBootDemoApplication {

	@Value("${text}")
	private String textStr;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@RequestMapping("/helloWorld")
	@ResponseBody
	public Map<String,Object> helloWorld()
	{
		Map<String,Object> result = new HashMap<>();
		result.put("A","AAAAA");
		result.put("B","BBBBB");
		return result;
	}

	@RequestMapping("/server")
	@ResponseBody
	public String test()
	{
		return "test8003";
	}

	@RequestMapping("/testConfig")
	@ResponseBody
	public String testConfig()
	{
		return textStr;
	}

}


