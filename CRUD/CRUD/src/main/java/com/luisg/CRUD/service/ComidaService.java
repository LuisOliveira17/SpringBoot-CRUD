package com.luisg.CRUD.service;

import com.luisg.CRUD.dto.ComidaRequestDto;
import com.luisg.CRUD.dto.ComidaResponseDto;
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
    public List<ComidaResponseDto> getAllComidas(){
        return comidaRepository.findAll()
                .stream()
                .map(comida -> toResponseDto(comida))
                .toList();
    }

    //Salvar
    public ComidaResponseDto salvarComida(ComidaRequestDto dto){
        Comida comida = toEntity(dto);
        Comida salva =  comidaRepository.saveAndFlush(comida);
        return toResponseDto(salva);
    }

    //Deletar
    public void deleteComida(Long comidaId) {
        comidaRepository.deleteById(comidaId);
    }

    //Conversões para os DTO's
    private Comida toEntity(ComidaRequestDto dto) {
        Comida comida = new Comida();
        comida.setNome(dto.getNome());
        comida.setQuantidade(dto.getQuantidade());
        comida.setDataValidade(dto.getDataValidade());
        return comida;
    }

    private ComidaResponseDto toResponseDto(Comida comida) {
        return new ComidaResponseDto(
                comida.getId(),
                comida.getNome(),
                comida.getQuantidade(),
                comida.getDataValidade()

        );
    }
}
