package com.luisg.CRUD.service;

import com.luisg.CRUD.model.Comida;
import com.luisg.CRUD.repository.ComidaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Faz as regras
public class ComidaService {
    private final ComidaRepository comidaRepository;

    //Extender o Repository ao JPA e injetar no Service:

    public ComidaService(ComidaRepository comidaRepository) {
        this.comidaRepository = comidaRepository;
    }

    //Listar
    public List getAllComidas() {
        return comidaRepository.findAll();
    }

    //Salvar
    public Comida saveComida(Comida comida) {
        return comidaRepository.saveAndFlush(comida);
    }

    //Deletar
    public void deleteComida(Long comidaId) {
        comidaRepository.deleteById(comidaId);
    }
}
