package com.project.TodoApp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {


    private TodoService todoService;
    
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }


    @RequestMapping("/todo-list")
    public String todoList(ModelMap model){
        model.put("todo",todoService.getList());
        return "TodoPage.jsp";
    }


}
