package com.luisg.CRUD.dto;

import java.time.LocalDate;

public class ComidaResponseDto {
    private final Long id;
    private final String nome;
    private final Integer quantidade;
    private LocalDate dataValidade;

    public ComidaResponseDto(Long id, String nome, Integer quantidade, LocalDate dataValidade) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.dataValidade = LocalDate.now();
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Long getId() {
        return id;
    }
}
