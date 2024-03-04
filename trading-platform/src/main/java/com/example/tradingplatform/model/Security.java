package com.example.tradingplatform.model;
import jakarta.persistence.*;

@Entity
@Table(name = "security")
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    public Security() {

    }

}