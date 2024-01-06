package com.example.demo;

import java.util.List;
import java.util.Arrays;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @RequestMapping("/home")
    public List<Courses> home(){
        return Arrays.asList(
                new Courses(1010,"Aya","OOP"),
                new Courses(2020,"Shlok","Java"),
                new Courses(3030,"Jackson","Operating System"),
                new Courses(3030,"Jack","Code Canhes Made here")
        );
    }



}
