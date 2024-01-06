// package com.database.H2Database.course.jdbc;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.stereotype.Component;
//
// import com.database.H2Database.course.Course;
//
//
//
// // The commandLineRunner is basically used to run the mehtods or the commands that needs to be run as soon as the applicaiton get started
// @Component
// public class CourseJdbcCommandLineRunner implements CommandLineRunner {
//
//
//     @Autowired
//     private CourseJdbcRepository repository;
//
//     @Override
//     public void run(String... args) throws Exception {
//         // repository.insert();
//         repository.insert(new Course(4040,"Aaditya","Jackson"));
//         repository.insert(new Course(1010,"Spruha","Mark"));
//         repository.insert(new Course(3030,"Shlok","Jhon"));
//         repository.insert(new Course(9090,"Pranay","Tommy"));
//         repository.deleteById(1010);
//
//
//     }
// }
