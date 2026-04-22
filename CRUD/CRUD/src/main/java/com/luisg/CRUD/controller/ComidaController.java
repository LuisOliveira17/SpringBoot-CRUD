package com.luisg.CRUD.controller;

import com.luisg.CRUD.model.Comida;
import com.luisg.CRUD.service.ComidaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Defino que esta classe é um controller
@RequestMapping("/Comida")//Gera os mapas para reconhecer as rotas ex: (localhost/Comida)

public class ComidaController {

    private final ComidaService comidaService;

    public ComidaController(ComidaService comidaService) {
        this.comidaService = comidaService;
    }

    //Get
    @GetMapping
    public List getAllComidas() {
        return comidaService.getAllComidas();
    }

    @PostMapping
    public Comida saveComida(@RequestBody Comida comida) {
        return comidaService.saveComida(comida);
    }

    @DeleteMapping
    public void deleteComida(@RequestBody Comida comida) {
        comidaService.deleteComida(comida.getId());
    }
}
