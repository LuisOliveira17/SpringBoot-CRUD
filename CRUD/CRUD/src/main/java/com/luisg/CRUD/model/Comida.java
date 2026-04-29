package com.luisg.CRUD.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity //Estou dizendo que a classe é uma entidade dentro do BD
@Table(name = "Comida")
@Getter @Setter
public class Comida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Integer quantidade;
    private LocalDate dataValidade;

    public Comida() {

    }

    public Comida(Long id, String nome, Integer quantidade, LocalDate dataValidade) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
    }


}
