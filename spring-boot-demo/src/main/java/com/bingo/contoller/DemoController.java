package com.bingo.contoller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value = "/yyyy",method = {RequestMethod.GET})
    public String welcome(Model model)
    {
        model.addAttribute("host","BBB");
        return "welcome";
    }
}
