package co.usa.recursohumano.recursohumano.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.usa.recursohumano.recursohumano.model.Departamento;
import co.usa.recursohumano.recursohumano.repository.crud.DepartamentoCrudRepositorio;

@Repository
public class DepartamentoRepositorio {

    @Autowired
    private DepartamentoCrudRepositorio departamentoCrudRepositorio;

    public List<Departamento> getAll(){
        return (List<Departamento>)departamentoCrudRepositorio.findAll();
    }
    
    public Optional<Departamento>getDepartamento(int id){
        return departamentoCrudRepositorio.findById(id);
    }

    public Departamento save(Departamento dpto){
        return departamentoCrudRepositorio.save(dpto);
    }


}
