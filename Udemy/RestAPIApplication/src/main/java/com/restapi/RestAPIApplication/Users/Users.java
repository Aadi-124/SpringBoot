package com.restapi.RestAPIApplication.Users;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity(name="User_Details")
public class Users {


    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column
    private LocalDate birthDate;

    // A user has one to many relationship with the post 
    // One user can have multiple posts 
    @OneToMany(mappedBy = "users")
    @JsonIgnore
    private List<Posts> posts;
    
    public List<Posts> getPosts() {
        return posts;
    }
    

    public void setPosts() {
        this.posts = posts;
    }

    public Users(){

    }

    public Users(int id, String name, LocalDate birthDate,List<Posts> posts) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public LocalDate getBirthDate() {
        return birthDate;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    
    @Override
    public String toString() {
        return "Users [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
    }


}
