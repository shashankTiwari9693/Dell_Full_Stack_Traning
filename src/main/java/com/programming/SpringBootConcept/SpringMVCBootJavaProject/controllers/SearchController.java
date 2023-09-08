package com.programming.SpringBootConcept.SpringMVCBootJavaProject.controllers;

import com.programming.SpringBootConcept.SpringMVCBootJavaProject.beans.Product;
import com.programming.SpringBootConcept.SpringMVCBootJavaProject.repository.ProductRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@Controller
public class SearchController {

    @Autowired
    private ProductRepository productRepository;

    /* @GetMapping("/search")
     public String searchPage(@RequestParam("search") String search, Model model){
         System.out.println("In Search Controller");
         System.out.println("Searching for"+ search);

         List<Product> products = new ArrayList<>();
         products =productRepository.searchByName(search);
         model.addAttribute("products",products);
         return "search";
     }*/
    @GetMapping("/search")
    public Callable<String> searchPage(@RequestParam("search") String search, Model model, HttpServletRequest request) {
        System.out.println("In Search Controller");
        System.out.println("Searching for" + search);
        System.out.println("Async Programming Supported in Spring Boot" + request.isAsyncSupported());
        System.out.println("Thread Created by Servlet Container" + Thread.currentThread().getName());
        return () -> {
            Thread.sleep(3000);
            System.out.println("Thread from Spring MVC Task Executor is" + Thread.currentThread().getName());
            List<Product> products = new ArrayList<>();
            products = productRepository.searchByName(search);
            model.addAttribute("products", products);
            return "search";
        };
    }

}
