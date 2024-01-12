package com.restapi.RestAPIApplication.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/helloworld")
    public String greet(){
        return "Hello World";
    }


    @GetMapping("/greet2")
    public String greet2(){
        return "Hello Greet2";
    }


    
   


    

}
