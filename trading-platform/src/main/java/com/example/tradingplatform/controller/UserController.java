package com.example.tradingplatform.controller;

import com.example.tradingplatform.model.User;
import com.example.tradingplatform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<?> getUserById(@PathVariable("id") long id){
        return new ResponseEntity<>(userRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping("/users/name/{username}")
    public ResponseEntity<User> getUsersByUsername(@PathVariable("username") String username){
        return new ResponseEntity<>(userRepository.findByUsername(username), HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return new ResponseEntity<>(userRepository.save(user), HttpStatus.OK);
    }

}
