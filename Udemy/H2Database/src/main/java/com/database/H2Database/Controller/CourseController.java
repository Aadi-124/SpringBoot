package com.database.H2Database.Controller;


import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.database.H2Database.course.springdatajpa.CoourseSpringDataJpaRepository;

// import com.database.H2Database.course.Course;
// import com.database.H2Database.course.jpa.CourseJpaCommandLineRunner;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CourseController {


    @Autowired
    private CoourseSpringDataJpaRepository repository;
    
    @GetMapping("/")
    public String greet(){
        return "<h1 style='color:red'> Welcome to the Database Example! </h1>";
    }
  
    @GetMapping("/data")
    public String showData(){
        // return "<h1> findAll() = "+repository.findAll().toString()+"</h1>";
        // return "<h1>repository.count() = "+repository.count()+"</h1>";
        return "<h1>repository.findByAuthor('Jakson') = "+repository.findByAuthor("Mark")+"</h1>";
        // return "<h1>repository.findByName('Shlok') = "+repository.findByName("Shlok")+"</h1>";
        
    }


}
