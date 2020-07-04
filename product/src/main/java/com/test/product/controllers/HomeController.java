package com.test.product.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@Controller
public class HomeController {
    private static Logger sportyLogger =
            Logger.getLogger(HomeController.class.getName());
    @GetMapping("/home")
    public String goHome(){
        sportyLogger.info("In Home Controller");
        return "index";
    }

    @GetMapping("/goToSearch")
    public String getToSearch(){
        sportyLogger.info("Going to search page");
        return "search";
    }

    @GetMapping("/goToLogin")
    public String getToLogin(){
        sportyLogger.info("Going to LogIn page");
        return "login";
    }

    @GetMapping("/goToRegistration")
    public String getToRegistration(){
        sportyLogger.info("Going to register page");
        return "register";
    }
}
