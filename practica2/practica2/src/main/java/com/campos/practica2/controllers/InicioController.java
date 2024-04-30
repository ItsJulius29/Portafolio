package com.campos.practica2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.campos.practica2.model.entidad.Categoria;
import com.campos.practica2.model.service.ICategoriaService;

@Controller
public class InicioController {
    
    @Autowired
    private ICategoriaService categoriaService;

    @RequestMapping("/")
    public String inicio(Model model){
        Categoria categoria = new Categoria();
        model.addAttribute("categoria", categoria);
        model.addAttribute("listaCategorias", categoriaService.listarCategorias());
        return "inicio";
    }

    @RequestMapping(value = "/formulario", method = RequestMethod.POST)
    public String guardar(Categoria categoria){
        categoriaService.guardar(categoria);
        return "redirect:/";
    }
}
