package com.bingo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @Value("${info.test:myWorld}")
    private String text;

    @RequestMapping("/myWorld")
    public String myWorld(Model model)
    {
        model.addAttribute("text",text);
        return "world";
    }
}
