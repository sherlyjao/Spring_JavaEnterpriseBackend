package com.spring.spring_demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.spring_demo.Student;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
public class SampleRestController {

    //private field for dependency injection
    private Student myStudent;
    private Student anotherStudent;

    //setter method
    // @Autowired 
    // public void setStudent(@Qualifier("universityStudent")Student student) {
    //     myStudent = student;
    // }

    //check if bean is singleton
    public SampleRestController(
        @Qualifier("elementaryStudent") Student student
        // @Qualifier("universityStudent") Student student_two
    ) {
        myStudent = student;
        // anotherStudent = student_two;
    }
 
    @GetMapping ("/assignment")
    public String getAssignment() {
        return myStudent.getDailyAssignment();
    }

    // @GetMapping("/check")
    // public String checkScope() {
    //     return "myStudent == anotherStudent? " + (myStudent == anotherStudent);
    // }
    
}
