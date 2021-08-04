package com.siam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @Autowired HelloService helloService;
    @GetMapping({"/hello",""})
    public String hello(Model model){
        model.addAttribute("name",helloService.name());
         return "index";
    }
}
