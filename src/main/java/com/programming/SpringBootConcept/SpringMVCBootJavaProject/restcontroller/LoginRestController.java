package com.programming.SpringBootConcept.SpringMVCBootJavaProject.restcontroller;

import com.programming.SpringBootConcept.SpringMVCBootJavaProject.beans.Login;
import com.programming.SpringBootConcept.SpringMVCBootJavaProject.beans.User;
import com.programming.SpringBootConcept.SpringMVCBootJavaProject.exception.LogingFailureException;
import com.programming.SpringBootConcept.SpringMVCBootJavaProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginRestController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/hplus/rest/loginuser")
        public ResponseEntity checkLoginUser(@RequestBody Login login) throws LogingFailureException {
        System.out.println(login.getUsername()+" "+login.getPassword());
        User user = userRepository.searchByUserName(login.getUsername());
        if(user==null){
            //return ResponseEntity.status(404).build();
            return new ResponseEntity<>("User name nai milaaa",HttpStatus.NOT_FOUND);
        }
        if(user.getUsername().equals(login.getUsername())&&
        user.getPassword().equals(login.getPassword())){

            return new ResponseEntity<>("User Name mil gaya ",HttpStatus.OK);
        }
        else{
            throw new LogingFailureException("Invalid Username or Password");
        }
    }
    }

