package com.programming.SpringBootConcept.SpringMVCBootJavaProject.controllers;

import com.programming.SpringBootConcept.SpringMVCBootJavaProject.beans.Login;
import com.programming.SpringBootConcept.SpringMVCBootJavaProject.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeController {
    @GetMapping("/")
    public String showHomePage() {
        System.out.println("In Home Controller");
        return "index";
    }

    @GetMapping("/goToSearch")
    public String showSearchPage() {
        System.out.println("Showing Search Page to User");
        return "search";
    }

    @GetMapping("/goToLogin")
    public String showLoginPage() {
        System.out.println("Showing login Page to User");
        return "login";
    }

    @GetMapping("/goToRegistration")
    public String showRegistrationPage() {
        System.out.println("Showing Registration Page to User");
        return "register";
    }


}
