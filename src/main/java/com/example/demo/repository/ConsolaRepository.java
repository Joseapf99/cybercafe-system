package com.example.demo.repository;

import com.example.demo.entity.Consola;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsolaRepository extends JpaRepository<Consola, Long> {
}