package com.test.product.controllers;

import com.test.product.beans.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.logging.Logger;

@Controller
public class UserProfileController {

    private static Logger sportyLogger =
            Logger.getLogger(HomeController.class.getName());

    @PostMapping("/userprofile")
    public String getUserProfile(@SessionAttribute("login") Login login, Model model){

        sportyLogger.info("In UserProfile Controller");
        sportyLogger.info("username from session: " + login.getUsername());
        //call to userrepository to get all the user information
        model.addAttribute("username", login.getUsername());
        return "profile";
    }
}
