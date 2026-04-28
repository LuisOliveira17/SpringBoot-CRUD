package com.luisg.CRUD.dto;

//O request será apenas um DTO para Entrada de dados. Não terá Setters
//Também não terá ID, pois é apenas uma classe de entrada de dados. O ID é gerado na camada de BD
//Aqui, se trata as validações de entrada do usuário

import java.time.LocalDate;

public class ComidaRequestDto {
    private final String nome;
    private final Integer quantidade;
    private final LocalDate dataValidade;

    public void validar(String nome, Integer quantidade, LocalDate dataValidade) {
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("O campo nome deve ser preenchido");
        }

        else if(quantidade<0 ||quantidade ==null){
            throw new IllegalArgumentException("A quantidade deve ser maior que zero");
        }
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public ComidaRequestDto(String nome, Integer quantidade, LocalDate dataValidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
        validar(nome,quantidade,dataValidade);
    }



}
