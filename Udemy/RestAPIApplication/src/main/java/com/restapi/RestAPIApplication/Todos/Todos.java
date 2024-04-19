package com.restapi.RestAPIApplication.Todos;

import org.springframework.stereotype.Component;

@Component
public class Todos {
    
    private int id;
    private String description;
    private boolean isDone;

    public Todos(int id, String description, boolean isDone){
        this.id = id;
        this.description = description;
        this.isDone = isDone;
    }

    public Todos(){
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean getIsDone() {
        return isDone;
    }
    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }


    


}
