package com.restapi.RestAPIApplication.Todos;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class TodoDaoService {

    public static ArrayList<Todos> todolist = new ArrayList<Todos>();
    private static int id = 100;

    static{
        
        todolist.add(new Todos(++id,"Do Home Work", true));
        todolist.add(new Todos(++id,"Do Workout", false));
        todolist.add(new Todos(++id,"Do Lunch", false));
        todolist.add(new Todos(++id,"Do Coding", true));
        todolist.add(new Todos(++id,"Do Communication", false));
        todolist.add(new Todos(++id,"Play Outdoor", true));
        todolist.add(new Todos(++id,"Do Exercise ", true));
        todolist.add(new Todos(++id,"Do Home Dinner", false));
        todolist.add(new Todos(++id,"Do Brakfast", true));
        todolist.add(new Todos(++id,"Do Entertainment", true));
    }

    public ArrayList<Todos> getAllTodos(){
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
        return false;
    }

    
    public Todos deleteTodo(int id){

        for(Todos todo: todolist){
            if(todo.getId() == id){
                Todos t = todo;
                todolist.remove(id);
                return t;
            }
        }
        return null;
    }

    
}
