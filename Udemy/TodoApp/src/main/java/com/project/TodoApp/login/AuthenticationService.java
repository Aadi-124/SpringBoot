package com.project.TodoApp.login;

// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String name, String password){
        
        boolean isValidUser = name.equalsIgnoreCase("Aaditya");
        boolean isValidPassword = password.equals("8275");

        return isValidUser && isValidPassword;
        
    }




}
