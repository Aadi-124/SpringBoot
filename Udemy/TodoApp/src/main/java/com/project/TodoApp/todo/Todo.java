package com.project.TodoApp.todo;

import java.time.LocalDate;




public class Todo {
    
    private int Id;
    private String userName;    
    private String description;
    private LocalDate targetDate;
    private boolean done;
    

    public Todo(int id, String userName, String description, LocalDate targetDate, boolean done) {
        Id = id;
        this.userName = userName;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }



    public int getId() {
        return Id;
    }

    public String getUserName() {
        return userName;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public boolean isDone() {
        return done;
    }

    

    public void setId(int id) {
        Id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String toString(){
        return "[ID = "+Id + " userName = "+userName+" Description = "+description + " TargetDate = " + targetDate + " Done = "+done+" ]";
    }

    
}
