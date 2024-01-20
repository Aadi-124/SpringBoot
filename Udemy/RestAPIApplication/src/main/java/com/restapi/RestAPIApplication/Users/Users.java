package com.restapi.RestAPIApplication.Users;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;



@Entity(name="User_Details")
public class Users {


    @Id
    private Integer id;

    @Column
    private String name;

    @Column
    private LocalDate birthDate;

    public Users(){

    }

    public Users(int id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
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
