package com.example.tradingplatform.controller;

import com.example.tradingplatform.model.Order;
import com.example.tradingplatform.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getAllOrders(){
        return new ResponseEntity<>(orderRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/orders/{id}")
    public ResponseEntity<?> getOrderById(@PathVariable("id") long id){
        return new ResponseEntity<>(orderRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping("/orders/user/{id}")
    public ResponseEntity<List<Order>> getOrdersByUserId(@PathVariable("id") long id){
        return new ResponseEntity<>(orderRepository.findByUserId(id), HttpStatus.OK);
    }

    @GetMapping("/orders/type/{type}")
    public ResponseEntity<List<Order>> getOrdersByType(@PathVariable("type") String type){
        return new ResponseEntity<>(orderRepository.findByType(type), HttpStatus.OK);
    }

    @PostMapping("/orders")
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        return new ResponseEntity<>(orderRepository.save(order), HttpStatus.OK);
    }

    //update

    //delete

}
