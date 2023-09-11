package com.programming.SpringBootConcept.SpringMVCBootJavaProject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ApplicationException.class)
    public String handleException() {
        System.out.println("Caught via Exception Handler in Global Exception Handler class");
        return "error";
    }

    @ExceptionHandler(LogingFailureException.class)
    public ResponseEntity handleLoggingFailureException(LogingFailureException ex) {
        System.out.println("Caught via Exception Handler in Global Exception Handler class");
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(ex.getMessage());
    }
}
