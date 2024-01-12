package com.project.TodoApp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")   // this annotation is used to use a perticular data or variable across all the web pages which are defined in this calss
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
