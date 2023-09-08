package com.programming.SpringBootConcept.SpringMVCBootJavaProject.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ApplicationException.class)
    public String handleException() {
        System.out.println("Caught via Exception Handler in Global Exception Handler class");
        return "error";
    }
}
