package com.restapi.RestAPIApplication.Controller;

import org.springframework.stereotype.Component;

@Component
public class RestAPIBean {
    
    private String id;
    private String name;
    private String age;
    private String salary;
    private String dob;


    

    public RestAPIBean() {
    }

    public RestAPIBean(String id, String name, String age, String salary, String dob) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dob = dob;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }

    


}
