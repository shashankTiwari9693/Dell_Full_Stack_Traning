package com.programming.SpringBootConcept.SpringMVCBootJavaProject.controllers;

import com.programming.SpringBootConcept.SpringMVCBootJavaProject.beans.User;
import com.programming.SpringBootConcept.SpringMVCBootJavaProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;


    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User userobj = userRepository.save(user);
        System.out.println(userobj);
        return new ResponseEntity<>(userobj, HttpStatus.OK);
    }

    @PostMapping("/updateUserById/{id}")
    public ResponseEntity<User> UpdateUerById(@PathVariable int id, @RequestBody User newUserData) {
        Optional<User> oldUserData = userRepository.findById(id);
        if (oldUserData.isPresent()) {
            User updatedUser = oldUserData.get();
            updatedUser.setFirst_name(newUserData.getFirst_name());
            updatedUser.setActivity(newUserData.getActivity());
            updatedUser.setGender(newUserData.getGender());

            User userObj = userRepository.save(updatedUser);
            return new ResponseEntity<>(HttpStatus.OK);

        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/deleteUserById/{id}")
    public ResponseEntity<User> DeleteUerById(@PathVariable int id) {
        userRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
