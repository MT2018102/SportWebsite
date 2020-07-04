package com.test.product.controllers;

import com.test.product.beans.Login;
import com.test.product.beans.User;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@ControllerAdvice
public class DefaultModelAttributeController {

    /*To add default value of the properties of the bean*/
    @ModelAttribute("newuser")
    public User getDefaultUser(){
        return new User();
    }

    @ModelAttribute("genderItems")
    public List<String> getGenderItems(){
        return Arrays.asList(new String[] {"Male", "Female", "Other"});
    }

    @ModelAttribute("login")
    public Login getDefaultLogin(){
        return new Login();
    }

}
