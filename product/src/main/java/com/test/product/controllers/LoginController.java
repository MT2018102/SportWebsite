package com.test.product.controllers;

import com.test.product.beans.Login;
import com.test.product.beans.User;
import com.test.product.exceptions.ApplicationException;
import com.test.product.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.util.logging.Logger;

@Controller
@SessionAttributes("login")
public class LoginController {
    private static Logger sportyLogger =
            Logger.getLogger(LoginController.class.getName());

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(@ModelAttribute("login") Login login, HttpSession session){
        //full session management
        //with session object
        //session.setAttribute("", "");
        //session.setMaxInactiveInterval(1000);
        User user = userRepository.searchByName(login.getUsername());
        if(user==null){
            throw new ApplicationException("User not found");
        }
        return "forward:/userprofile";
    }

    @ExceptionHandler(ApplicationException.class)
    public String handleException(){
        sportyLogger.info("In Exception Handler of Login Controller");
        return "error";
    }
}
