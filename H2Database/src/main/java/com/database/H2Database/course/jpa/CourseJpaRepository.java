package com.database.H2Database.course.jpa;

import org.springframework.stereotype.Repository;

import com.database.H2Database.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional   
public class CourseJpaRepository {
    
    // @Autowired
    @PersistenceContext       // just like @Autowired but more specific
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public Course findById(long id){
        return entityManager.find(Course.class,id);
    }

    public void deleteById(long id){
        Course course = entityManager.find(Course.class,id);
        entityManager.remove(course);
    }

}
