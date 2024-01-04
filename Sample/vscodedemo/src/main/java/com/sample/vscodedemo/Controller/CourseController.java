package com.sample.vscodedemo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CourseController {
    

    @RequestMapping("/home")
    public String greet(){
        return "Good Morning";
    }




}
