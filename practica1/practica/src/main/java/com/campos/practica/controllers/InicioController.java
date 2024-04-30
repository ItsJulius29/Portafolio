package com.campos.practica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class InicioController {
    @RequestMapping("/")
    public String inicio(){
        return "inicio"; 
    }

    @RequestMapping("/process")
    public String procesar(
        @RequestParam int dni,
        @RequestParam String nombre,
        @RequestParam String apellidos,
        @RequestParam String correo, Model model){

            String mensaje = "El dni es: " + dni ;
            String mensaje2 = "Los nombres es: " + nombre ;
            String mensaje3 = "Los apellidos es: " + apellidos ;
            String mensaje4 = "El correo es: " + correo ;

            model.addAttribute("rpta1", mensaje);
            model.addAttribute("rpta2", mensaje2);
            model.addAttribute("rpta3", mensaje3);
            model.addAttribute("rpta4", mensaje4);

            return "resultado";

    }

}
