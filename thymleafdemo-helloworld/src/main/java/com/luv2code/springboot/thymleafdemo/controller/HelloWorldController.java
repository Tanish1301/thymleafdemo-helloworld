package com.luv2code.springboot.thymleafdemo.controller;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    // need a controller to show HTML form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }
    // need a controller to process the HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // need a controller to read form data
    // add data to model
    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){

        theName = theName.toUpperCase();

        String result = "Hey my Friend from V3! " + theName;

        // Add the message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

}
