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

    //Conversões para os DTO's
    private Comida toEntity(ComidaRequestDto dto) {
        Comida comida = new Comida();
        comida.setNome(dto.getNome());
        comida.setQuantidade(dto.getQuantidade());
        comida.setDataValidade(dto.getDataValidade());
        return comida;
    }

    //Só gerará o DTO de Response se passar por todas as validações do Request
    private ComidaResponseDto toResponseDto(Comida comida) {
        return new ComidaResponseDto(
                comida.getId(),
                comida.getNome(),
                comida.getQuantidade(),
                comida.getDataValidade()

        );
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

    //Get Com Id
    public ComidaResponseDto getComidaById(Long id){
       Comida comida = comidaRepository.findById(id)
               .orElseThrow(()->new RuntimeException("Comida não encontrada"));
       return toResponseDto(comida);
    }

    //Atualizar
    public ComidaResponseDto atualizarComida(Long id,ComidaRequestDto dto){
       Comida comidaAchada = comidaRepository.findById(id).orElseThrow(()-> new RuntimeException("Comida não encontrada"));

       if(dto.getNome() != null && !dto.getNome().isBlank()){
           comidaAchada.setNome(dto.getNome());
       }

       if(dto.getDataValidade() != null){

           comidaAchada.setDataValidade(dto.getDataValidade());
       }

       if(dto.getQuantidade() != null){
           comidaAchada.setQuantidade(dto.getQuantidade());
       }

       comidaRepository.save(comidaAchada);

       return toResponseDto(comidaAchada);
    }
}