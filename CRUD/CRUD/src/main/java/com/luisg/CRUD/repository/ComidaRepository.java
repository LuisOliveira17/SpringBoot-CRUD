package com.luisg.CRUD.repository;

import com.luisg.CRUD.model.Comida;
import org.springframework.data.jpa.repository.JpaRepository;

//Transformar o Repository em uma interface
//Extender a classe ao JPA e deifinir que estou passando um objeto Comida e seu tipo de ID(Long)
public interface ComidaRepository extends JpaRepository<Comida,Long> {

}
