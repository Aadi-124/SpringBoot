package com.restapi.RestAPIApplication.Controller;


// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    // @Autowired(required=true)
    // HelloWorldBean bean;



    @GetMapping(path = "/")
    public String greet5(){
        return "Hello World";
    }

    @GetMapping(path = "/helloworld")
    public String greet(){
        return "Hello World";
    }


    @GetMapping(path = "/greet2")
    public String greet2(){
        return "Hello Greet2";
    }



    @GetMapping(path = "/show")
    public HelloWorldBean hello(){
        return new HelloWorldBean("This is the Message!");
    }
    

    @GetMapping(path = "/show/showName/{name}")
    public HelloWorldBean helloBean(@PathVariable String name){
        return new HelloWorldBean("Welcome "+name);
    }
    
   


    

}
