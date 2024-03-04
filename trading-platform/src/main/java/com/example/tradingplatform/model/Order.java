package com.example.tradingplatform.model;
import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "userId")
    private long userId;

    @Column(name = "securityId")
    private long securityId;

    @Column(name = "type") //either BUY or SELL
    private String type;

    @Column(name = "price")
    private double price;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "fulfilled")
    private boolean fulfilled;

    public Order() {

    }

}
