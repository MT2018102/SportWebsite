package com.test.product.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.logging.Logger;

@Controller
public class LogoutController {

    private static Logger sportyLogger =
            Logger.getLogger(LogoutController.class.getName());

    @GetMapping("/logout")
    public String logout(HttpSession session){
        sportyLogger.info("Ending user session.");
        session.invalidate();
        return "login";
    }
}
