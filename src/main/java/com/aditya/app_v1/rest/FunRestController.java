package com.aditya.app_v1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello World hehe";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Working out";
    }

    @GetMapping("/fortune")
    public String getFortune(){
        return "You are very fortunate today!!!";
    }
}
