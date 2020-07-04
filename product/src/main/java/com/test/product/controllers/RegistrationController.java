package com.test.product.controllers;

import com.test.product.beans.User;
import com.test.product.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

@Controller
public class RegistrationController {

    private static Logger sportyLogger =
            Logger.getLogger(RegistrationController.class.getName());

    @Autowired
    private UserRepository userRepository;

    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.registerCustomEditor(Date.class,"dateOfBirth",
                                    new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),
                                   true));
    }

    /*Binding Result should always be after @ModelAttribute parameter*/
    @PostMapping("/registeruser")
    public String registerUser(@Valid @ModelAttribute("newuser") User user,
                               BindingResult result, Model model){
        sportyLogger.info("In Registration Controller");
        sportyLogger.info("DateBirth of User is: "+user.getDateOfBirth());
        if(result.hasErrors()){
            return "register";
        }
        userRepository.save(user);
        model.addAttribute("dataSaved", "User registered successfully");
        return "login";
    }
}
