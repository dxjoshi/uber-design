package com.intuit.driver.controllers;

import com.intuit.driver.exceptions.UserAlreadyCreatedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class LoginErrorAdvice {

    @ResponseBody
    @ExceptionHandler(UserAlreadyCreatedException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String userAlreadyCreatedException(UserAlreadyCreatedException ex) {
        return ex.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String commonRuntimeExceptionHandler(RuntimeException ex) {
        return ex.getMessage();
    }

}
