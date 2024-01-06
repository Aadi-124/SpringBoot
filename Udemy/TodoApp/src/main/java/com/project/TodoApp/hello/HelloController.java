package com.project.TodoApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    
    @RequestMapping("/say-hello")
    @ResponseBody          // It will send returned String as it is to the browser.
    public String greet(){
        return "Hello World!";
    }
    
    @RequestMapping("/say-hello-html")
    @ResponseBody          // It will send returned String as it is to the browser.
    public String greetHTML(){
        return """
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Sending HTML throuhg springboot!</title>
            </head>
            <body>
            <h1 style='color:red'>Hello World!</h1>
            </body>
            </html>
                """;
    }



    @RequestMapping("/say-hello-jsp")
    // @ResponseBody          // This is removed because we doesn't want to send 'sayHello' as it is to the browser! 
    public String greetJSP(){
        // the sayHello is a jsp page which is returning from -> META-INF/resources/WEB-INF/jsp/
        return "sayHello.jsp";
    }

    



}
