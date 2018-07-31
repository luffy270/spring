package com.bingo.contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

    @Value("${info.message}")
    private String messgae;

    @RequestMapping(value = "/welcome",method = {RequestMethod.GET})
    public String welcome(Model model)
    {
        model.addAttribute("host",messgae);
        return "welcome";
    }
}
