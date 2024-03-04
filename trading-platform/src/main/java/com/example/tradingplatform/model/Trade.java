package com.example.tradingplatform.model;
import jakarta.persistence.*;

@Entity
@Table(name = "trades")
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "sellOrderId")
    private long sellOrderId;

    @Column(name = "buyOrderId")
    private long buyOrderId;

    @Column(name = "price")
    private double price;

    @Column(name = "quantity")
    private int quantity;

    public Trade() {

    }

}