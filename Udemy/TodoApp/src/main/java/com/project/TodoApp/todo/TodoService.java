package com.project.TodoApp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class TodoService {
    
    public static List<Todo> todos = new ArrayList<>();
    
    static {
        todos.add(new Todo(1, "Aaditya", "This is the First Task", LocalDate.now(), false));
        todos.add(new Todo(2, "Aaditya", "This is the Second Task", LocalDate.now(), false));
        todos.add(new Todo(3, "Aaditya", "This is the Third Task", LocalDate.now(), false));
    }

    public List<Todo> getList(){
        return todos;
    }
    

}
