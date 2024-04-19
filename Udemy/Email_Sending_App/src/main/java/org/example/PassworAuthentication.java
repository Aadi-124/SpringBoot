package org.example;

public class PassworAuthentication {

    private String username;
    private String password;

    public PassworAuthentication(String username, String password){
            this.username = username;
            this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
