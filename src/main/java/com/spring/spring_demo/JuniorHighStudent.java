package com.spring.spring_demo;

import org.springframework.stereotype.Controller;

@Controller 
public class JuniorHighStudent implements Student {

    public JuniorHighStudent() {
        System.out.println("In constructor:" + getClass().getSimpleName());
    }

    @Override 
    public String getDailyAssignment() {
        return "Study Spring Boot coding - jhs";
    }
}
