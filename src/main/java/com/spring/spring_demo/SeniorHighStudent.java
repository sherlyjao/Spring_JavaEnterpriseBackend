package com.spring.spring_demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

@Controller
// @Lazy 
public class SeniorHighStudent implements Student {
    
    public SeniorHighStudent() {
        System.out.println("In constructor:" + getClass().getSimpleName());
    }

    @Override 
    public String getDailyAssignment() {
        return "Study Spring Boot coding - shs";
    }
}
