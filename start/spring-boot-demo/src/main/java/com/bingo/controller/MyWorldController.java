package com.bingo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyWorldController {

    @Value("${info.text}")
    private String text;

    @GetMapping("/world")
    public String myWorld(Model model)
    {
        model.addAttribute("world",text);
        return "world";
    }

}
