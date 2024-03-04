package com.example.tradingplatform.controller;

import com.example.tradingplatform.model.Security;
import com.example.tradingplatform.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class SecurityController {

    @Autowired
    SecurityRepository securityRepository;

    @GetMapping("/securities")
    public ResponseEntity<List<Security>> getAllSecurities(){
        return new ResponseEntity<>(securityRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/securities/{id}")
    public ResponseEntity<?> getSecurityById(@PathVariable("id") long id){
        return new ResponseEntity<>(securityRepository.findById(id), HttpStatus.OK);
    }

//    @GetMapping("/securities/name/{name}")
//    public ResponseEntity<List<Order>> getOrdersByType(@PathVariable("type") String type){
//        return new ResponseEntity<>(orderRepository.findByType(type), HttpStatus.OK);
//    }

    @PostMapping("/securities")
    public ResponseEntity<Security> createSecurity(@RequestBody Security security) {
        return new ResponseEntity<>(securityRepository.save(security), HttpStatus.OK);
    }

}
