package com.restapi.RestAPIApplication.Controller;


import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")
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
    
    @GetMapping("/rest")
    public RestAPIBean restAPI(){
        return new RestAPIBean("2020", "Aaditya", "20", "5000000", "12-04-2004");
    }


    

}
