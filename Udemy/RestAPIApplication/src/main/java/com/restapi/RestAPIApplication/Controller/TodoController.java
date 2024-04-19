package com.restapi.RestAPIApplication.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.RestAPIApplication.Todos.TodoDaoService;
import com.restapi.RestAPIApplication.Todos.Todos;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TodoController {
    
    @Autowired
    public TodoDaoService service;


    @GetMapping("/todos")
    public ArrayList<Todos> getTodos(){
        return service.getAllTodos();
    }


    @DeleteMapping("/todos/{Id}")
    public Todos deleteTodos(@PathVariable int Id){
        return service.deleteTodo(Id);
    }

    @GetMapping("/todos/{Id}")
    public Todos getTodo(@PathVariable int Id){
        return service.getTodo(Id);
    }

    // @GetMapping
    // public Todo


}
