package com.luisg.CRUD.controller;

import com.luisg.CRUD.dto.ComidaRequestDto;
import com.luisg.CRUD.dto.ComidaResponseDto;
import com.luisg.CRUD.model.Comida;
import com.luisg.CRUD.service.ComidaService;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
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
    public ResponseEntity<List <ComidaResponseDto>> getAllComidas() {
        List<ComidaResponseDto> listaComidas = comidaService.getAllComidas();
        return ResponseEntity.ok(listaComidas);
    }

    //Response Entity Controla Respostas HTTP
    //A resposata será uma ResponseDto
    //O @RequestBody Pega o corpo da Resposta e converte para um RequestDto
    @PostMapping
    public ResponseEntity<ComidaResponseDto> saveComida(@RequestBody @Validated ComidaRequestDto dto) {
        ComidaResponseDto salva = comidaService.salvarComida(dto);
        return ResponseEntity.ok(salva);
    }

    //Cria o DeleteMapping passando apenas o caminho do id
    @DeleteMapping("/{id}")
    public void deleteComida(@PathVariable Long id) {
        comidaService.deleteComida(id);
    }

    //Get por ID
    @GetMapping("/{id}")
    public ResponseEntity<ComidaResponseDto> getComidaById(@PathVariable Long id) {
        ComidaResponseDto salva = comidaService.getComidaById(id);
        return ResponseEntity.ok(salva);
    }
}
