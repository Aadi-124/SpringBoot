package com.database.H2Database.course.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.database.H2Database.course.Course;

public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner{
    
    @Autowired
    private CoourseSpringDataJpaRepository repository;

 @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(4040,"Aaditya","Jackson"));
        repository.save(new Course(1010,"Spruha","Mark"));
        repository.save(new Course(3030,"Shlok","Jhon"));
        repository.save(new Course(9090,"Pranay","Tommy"));
        repository.deleteById(9090l);
        System.out.println(repository.findById(4040l).toString());
        System.out.println(repository.findById(3030l).toString());
        System.out.println(repository.findById(1010l).toString());
        System.out.println(repository.findById(9090l).toString());




    }




}
