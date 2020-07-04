package com.test.product.rest;

import com.test.product.beans.Login;
import com.test.product.beans.User;
import com.test.product.controllers.HomeController;
import com.test.product.exceptions.LoginFailureException;
import com.test.product.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class LoginRestController {

    private static Logger sportyLogger =
            Logger.getLogger(HomeController.class.getName());

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/sporty/rest/loginuser")
    public ResponseEntity loginUser(@RequestBody Login login)
                                    throws LoginFailureException{
        sportyLogger.info(login.getUsername()+" "+login.getPassword());
        User user = userRepository.searchByName(login.getUsername());

        if(user == null){
            //return ResponseEntity.status(404).build();
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }

        if(user.getUsername().equals(login.getUsername()) &&
           user.getPassword().equals(login.getPassword())) {
            return new ResponseEntity<>("Welcome, "+user.getUsername(), HttpStatus.OK);
        } else{
            //throw new Exception
            throw new LoginFailureException("Invalid username or password");
        }
    }
}
