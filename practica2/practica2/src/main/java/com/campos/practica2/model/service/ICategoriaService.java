package com.campos.practica2.model.service;

import java.util.List;

import com.campos.practica2.model.entidad.Categoria;

public interface ICategoriaService {

    public String guardar(Categoria categoria);
    public List<Categoria> listarCategorias();
    
}
