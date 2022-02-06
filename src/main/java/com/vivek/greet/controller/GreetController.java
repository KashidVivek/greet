package com.vivek.greet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;;
@RestController
public class GreetController {

    @RequestMapping(value="/welcome", method= RequestMethod.GET)
    public String firstPage() {
        return "Hello random person!";
    }
}
