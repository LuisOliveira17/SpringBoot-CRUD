package com.luisg.CRUD.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity //Estou dizendo que a classe é uma entidade dentro do BD
@Table(name = "Comida")

public class Comida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int quantidade;
    private LocalDate dataValidade;

    public Comida() {

    }

    public Comida(Long id, String nome, int quantidade, LocalDate dataValidade) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
}
