package com.programming.SpringBootConcept.SpringMVCBootJavaProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
@GetMapping("/")
    public String showHomePage(){
    System.out.println("In Home Controller");
    return "index";
}
@GetMapping("/goToSearch")
    public String showSearchPage()
    {
        System.out.println("Showing Search Page to User");
    return "search";
    }
}
