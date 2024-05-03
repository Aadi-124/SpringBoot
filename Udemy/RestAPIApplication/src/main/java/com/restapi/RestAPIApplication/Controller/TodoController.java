package com.restapi.RestAPIApplication.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.RestAPIApplication.Todos.TodoDaoService;
import com.restapi.RestAPIApplication.Todos.Todos;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


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


    @GetMapping("/sample/{name}/{todo}")
    public String sample(@PathVariable String name, @PathVariable String todo){
        return "name = "+name+"\ntodo = "+todo;
    }

    @PutMapping("/updatetodo/{id}")
    public Todos putMethodName(@PathVariable int id, @RequestBody Todos todo) {
        service.updateTodo(id,todo);
        return todo;
    }

    @PostMapping("/addtodo")
    public Todos addTodo(@RequestBody Todos todo){
        service.addTodo(todo);
        return todo;
    }

    @PutMapping("/setisdone/{id}")
    public boolean setIsDone(@PathVariable int id){
        service.setIsDone(id);
        return true;
    }
}
