package com.programming.SpringBootConcept.SpringMVCBootJavaProject.controllers;

import com.programming.SpringBootConcept.SpringMVCBootJavaProject.beans.Login;
import com.programming.SpringBootConcept.SpringMVCBootJavaProject.beans.User;
import com.programming.SpringBootConcept.SpringMVCBootJavaProject.exception.ApplicationException;
import com.programming.SpringBootConcept.SpringMVCBootJavaProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String validateUser(@ModelAttribute("login") Login login) throws ApplicationException {
        User user = userRepository.searchByUserName(login.getUsername());
        //System.out.println("User logging in application is" + user.getUsername());
        if (user == null) {
            throw new ApplicationException("User Not Found");
        }
        return "search";
    }


}
