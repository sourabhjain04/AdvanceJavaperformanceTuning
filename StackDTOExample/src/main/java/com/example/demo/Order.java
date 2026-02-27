package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;

    private Double price;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Getters & Setters
}