package com.database.H2Database.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.database.H2Database.course.Course;

public interface CoourseSpringDataJpaRepository extends JpaRepository<Course,Long>{
    

    List<Course> findByAuthor(String author);
    

}
