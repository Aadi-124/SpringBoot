// package com.database.H2Database.course.jdbc;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.BeanPropertyRowMapper;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.stereotype.Repository;
// import com.database.H2Database.course.Course;

// import jakarta.transaction.Transactional;

// @Repository
// @Transactional
// public class CourseJdbcRepository {

//     @Autowired
//     JdbcTemplate springJdbcTemplate;

//     @Autowired
//     // private Course course;

//     private static String INSERT_QUERY = """
//             insert into course(id,name,author) 
//             values (1,'Jack','Jons')
//             """;

//     private static String PARAM_INSERT_QUERY = """
//             insert into course (id,name,author) values(?,?,?)
//             """;

//     private static String DELETE_QUERY = """
//             delete from course where id = ?;
//             """;

//     private String SELECT_QUERY = """
//             select * from course
//             """;

//     public void insert(){
//         springJdbcTemplate.update(INSERT_QUERY);
//     }

    
//     public void insert(Course course){
//         springJdbcTemplate.update(PARAM_INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
//     }



//     public void deleteById(long id){
//         springJdbcTemplate.update(DELETE_QUERY, id);
//     }


//     public Course selectById(long id){
//         // An object of bean property mapper directly returns object based on the data fetched from the database.
//         return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class),id);
//     }
// }
