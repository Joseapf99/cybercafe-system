package com.example.demo.controller;

import com.example.demo.entity.Consola;
import com.example.demo.repository.ConsolaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consolas")
public class ConsolaController {

    private final ConsolaRepository consolaRepository;

    public ConsolaController(ConsolaRepository consolaRepository) {
        this.consolaRepository = consolaRepository;
    }

    // GET → obtener todos
    @GetMapping
    public List<Consola> obtenerConsolas() {
        return consolaRepository.findAll();
    }

    // POST → crear consola
    @PostMapping
    public Consola crearConsola(@RequestBody Consola consola) {
        return consolaRepository.save(consola);
    }
}

