package com.campos.practica2.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.campos.practica2.model.entidad.Categoria;

public interface ICategoriaDAO  extends CrudRepository<Categoria,Long>{
    
}
