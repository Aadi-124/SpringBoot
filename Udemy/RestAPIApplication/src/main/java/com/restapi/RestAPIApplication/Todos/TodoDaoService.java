package com.restapi.RestAPIApplication.Todos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.hibernate.mapping.Collection;
import org.springframework.stereotype.Component;

import jakarta.persistence.criteria.Predicate;

@Component
public class TodoDaoService {

    public static ArrayList<Todos> todolist = new ArrayList<Todos>();
    private static int id = -1;

    static{
        
        todolist.add(new Todos(++id,"Do Home Work","2024-09-21", false));
        todolist.add(new Todos(++id,"Do Workout","2024-07-15", false));
        todolist.add(new Todos(++id,"Do Lunch","2024-10-03", false));
        todolist.add(new Todos(++id,"Do Coding","2024-12-21", false));
        todolist.add(new Todos(++id,"Do Communication","2024-05-31", false));
        todolist.add(new Todos(++id,"Play Outdoor","2024-08-09", false));
        todolist.add(new Todos(++id,"Do Exercise ","2024-11-24", false));
        todolist.add(new Todos(++id,"Do Home Dinner","2025-01-21", false));
        todolist.add(new Todos(++id,"Do Brakfast","2024-05-21", false));
        todolist.add(new Todos(++id,"Do Entertainment","2024-06-06", false));
    }

    public ArrayList<Todos> getAllTodos(){
        Comparator<Todos> comparator = Comparator.comparing(Todos::getId);
        Collections.sort(todolist,comparator);
        return todolist;
    }

    public Todos getTodo(int id){
        for(Todos todo: todolist){
            if(todo.getId() == id){
                return todo;
            }
        }
        return null;
    }


    public boolean addTodo(Todos todo){
        todo.setId(++id);
        todolist.add(todo);
        return true;
    }

    public boolean setIsDone(int id){
        for(Todos todo:todolist){
            if(todo.getId() == id){
                todo.setIsDone(true);
                return true;
            }
        }
        return false;
    }
    
    public Todos deleteTodo(int id){
        Todos todo = todolist.get(id);
        todolist.remove(id);
        return todo;
    }

    public void deleteById(int id){
        todolist.removeIf(todo -> todo.getId() == id);
    }
    
    
    public Todos updateTodo(int id, Todos todo){
        // int count = -1;
        // for (Todos t : todolist) {
        //     count+=1;
        //     if(t.getId() == id){
        //         System.out.println("Entered!");
        //         todolist.remove(count);
        //     }
        //     System.out.println("count = "+count);
        // }
        deleteById(id);
        todo.setId(id);
        todolist.add(todo);
        return todo;
    }

    
}
