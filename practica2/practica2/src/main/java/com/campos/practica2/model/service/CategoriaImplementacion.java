package com.campos.practica2.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campos.practica2.model.dao.ICategoriaDAO;
import com.campos.practica2.model.entidad.Categoria;

@Service
public class CategoriaImplementacion  implements ICategoriaService{

    @Autowired
    private ICategoriaDAO categoriaDAO;

    @Override
    public String guardar(Categoria categoria) {
        categoriaDAO.save(categoria);
        return "Se registro la categoria";
    }

    @Override
    public List<Categoria> listarCategorias() {
        return (List<Categoria>) categoriaDAO.findAll();
    }
    
}
