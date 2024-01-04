package com.database.H2Database.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.database.H2Database.course.Course;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner{

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(4040,"Aaditya","Jackson"));
        repository.insert(new Course(1010,"Spruha","Mark"));
        repository.insert(new Course(3030,"Shlok","Jhon"));
        repository.insert(new Course(9090,"Pranay","Tommy"));
        repository.deleteById(1010);
        System.out.println(repository.findById(3030));




    }



}
