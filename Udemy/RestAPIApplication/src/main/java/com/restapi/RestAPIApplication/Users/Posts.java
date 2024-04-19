package com.restapi.RestAPIApplication.Users;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Posts {
    
    @Id
    @GeneratedValue
    private Integer Id;
    
    private String Description;

    

    public Posts() {

    }

    // FetchType.LAZY is used to only retrieve the Post Details and don't the User Details
    // But if we want to fetch the user details with the post details then we can use FetchType.EAGER.

    @ManyToOne(fetch = FetchType.LAZY)    
    private Users users;


    public Posts(Integer id, String description) {
        Id = id;
        Description = description;
    }

    @Override
    public String toString() {
        return "Posts [Id=" + Id + ", Description=" + Description + "]";
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Integer getId() {
        return Id;
    }

    public String getDescription() {
        return Description;
    }


}
