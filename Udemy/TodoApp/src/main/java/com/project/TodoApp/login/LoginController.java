package com.project.TodoApp.login;

// import org.slf4j.LoggerFactory;
// import org.slf4j.Logger;          // This is the import for Logger class
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    
    // this is just to print data as 'sout' at different logging levels
    // private Logger logger = LoggerFactory.getLogger(getClass()); 


    // @RequestMapping("login")
    // // The @Request Paramter is used to access the data passed into the queryparameter!
    // // and if we want to pass the data to the jsp page the we can use ModeMap!
    // public String gotoLoginPage(@RequestParam String name, ModelMap model){
    //     // The key represents the attribute in the Query Parameter
    //     //  and the second parameter accepts the value passed as an argument to this method!
    //     logger.debug("This is printed at debug level!");
    //     logger.info("This is printed at info level!");
    //     logger.warn("This is printed at warn level!");
    //     model.put("name", name);
    //     return "login.jsp";
    // }

        @Autowired
        AuthenticationService authenticationService;


        @RequestMapping(value="login",method = RequestMethod.GET)
        public String gotoLoginPage(){
            return "login.jsp";
        }

        @RequestMapping(value="login",method=RequestMethod.POST)
        public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model){
        // public String gotoWelcomePage(){
            if(authenticationService.authenticate(name,password)){
                model.put("name", name);
                model.put("password", password);
                return "welcome.jsp";
            }

            model.put("ErrorMessage","Incorrect Username or Password!");
            return "login.jsp";
        }





}
