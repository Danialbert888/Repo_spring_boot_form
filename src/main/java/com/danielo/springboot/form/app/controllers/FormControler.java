package com.danielo.springboot.form.app.controllers;

import com.danielo.springboot.form.app.models.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
// import javax.validation.Valid;

@Controller
public class FormControler {
    @GetMapping("/form")
    public String form(Model model){
 Usuario usuar=new Usuario();
model.addAttribute("titulo","formulario usuarios");
model.addAttribute("usuario",usuar);
        return "form";
    }

    @PostMapping("/form")
    public String procesar(  Usuario usuari ,Model model  ){



        model.addAttribute("titulo","resultado form");
        model.addAttribute("usuario",usuari);


        return "resultado";
    }

}
