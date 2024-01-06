package com.project.TodoApp.login;

// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String name, String password){
        
        boolean isValidUser = name.equalsIgnoreCase("Aaditya");
        boolean isValidPassword = password.equals("AadityaT@123");

        return isValidUser && isValidPassword;
        
    }




}
