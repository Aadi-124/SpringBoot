// package com.database.H2Database.course;

// import org.springframework.stereotype.Component;

// @Component
// public class Course {
    

//     private long id;
//     private String name;
//     private String author;



//     public Course(){

//     }



//     public Course(long id, String name, String author){
//         this.id = id;
//         this.name = name;
//         this.author = author;
//     }




//     public long getId(){
//         return id;
//     }

//     public String getName(){
//         return name;
//     }

//     public String getAuthor(){
//         return author;
//     }




//     public void setId(long id){
//         this.id = id;
//     }

//     public void setName(String name){
//         this.name = name;
//     }
 
//     public void setAuthor(String author){
//         this.author = author;
//     }

//     public String toString(){
//         return "id = " + id + " name = " + name + " author = " + author;
//     }


// }





// =================================================================================================================================
// The following code is for JPA!
// =================================================================================================================================
package com.database.H2Database.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.transaction.Transactional;


// @Entity maps the perticular class with the table in Database


// Here if we have different names of column and class the we can specify the name of the table to which we want to map the class
// But incase if we have same name the we can just directly use '@Entity' without specifying the column name
// Same for data members and columns!
// @Entity (name="Course") 
@Entity
// @Transactional
public class Course {
    
    // primary key annotation
    @Id
    private long id;
    
    // @Column (name="name")
    @Column               // because we have same name
    private String name;
    
    // @Column (name="author")
    @Column               // because we have same name
    private String author;



    public Course(){

    }



    public Course(long id, String name, String author){
        this.id = id;
        this.name = name;
        this.author = author;
    }




    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }




    public void setId(long id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
 
    public void setAuthor(String author){
        this.author = author;
    }

    public String toString(){
        return "id = " + id + " name = " + name + " author = " + author;
    }


}




