package com.test.product.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@Controller
public class RedirectionController {

    private static Logger sportyLogger =
            Logger.getLogger(RedirectionController.class.getName());

    @GetMapping("/redirectToLinkedIn")
    public String redirectToLinkedIn(){
        sportyLogger.info("In redirect Controller");
        return "redirect:http://www.linkedin.com";
    }
}
