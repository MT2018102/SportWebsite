package com.test.product.exceptions;

import com.test.product.controllers.RegistrationController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;

import java.util.logging.Logger;

@ControllerAdvice
public class ApplicationExceptionHandler {
    private static Logger sportyLogger =
            Logger.getLogger(RegistrationController.class.getName());

    @ExceptionHandler({ApplicationException.class, AsyncRequestTimeoutException.class})
    public String handleException(){
        System.out.println("In GLobal Exception Handler");
        return "error";
    }

    @ExceptionHandler({LoginFailureException.class})
    public ResponseEntity handleLoginFailure(LoginFailureException ex){
        sportyLogger.info("In Handle Login Failure Handler");
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(ex.getMessage());
    }


}
