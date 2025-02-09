package com.luv2code.springboot.thymleafdemo.controller;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DemoController {
    // create a mapping for "/hello"

    @GetMapping("/hello")
    public String sayHello(Model theModel){
        theModel.addAttribute("theData", java.time.LocalDateTime.now());

        return "helloworld"; // we have thymeleaf dependency in Maven POM, spring boot will auto-configure to use thymeleaf
    }

}
