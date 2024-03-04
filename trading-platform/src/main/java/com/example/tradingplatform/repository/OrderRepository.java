package com.example.tradingplatform.repository;


import java.util.List;

import com.example.tradingplatform.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByUserId(long userId);
    //List<Order> findBySecurityId(long securityId);
    List<Order> findByType(String type);
    //List<Order> findByPriceBetween(double price);

}
