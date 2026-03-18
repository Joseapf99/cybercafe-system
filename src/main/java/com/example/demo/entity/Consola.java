package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "consolas")
public class Consola {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private boolean disponible;
}