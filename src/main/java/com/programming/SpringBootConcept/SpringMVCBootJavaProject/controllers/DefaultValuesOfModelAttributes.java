package com.programming.SpringBootConcept.SpringMVCBootJavaProject.controllers;

import com.programming.SpringBootConcept.SpringMVCBootJavaProject.beans.Login;
import com.programming.SpringBootConcept.SpringMVCBootJavaProject.beans.User;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class DefaultValuesOfModelAttributes {
    @ModelAttribute("newuser")
    public User giveDefaultDataToUser() {
        return new User();
    }

    @ModelAttribute("login")
    public Login giveDefaultDataToLogic(){
        return new Login();
    }
}
