package com.curso.cep.controllers;

import com.curso.cep.models.CepDTO;
import com.curso.cep.services.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CepController {
    // Injeção do Service
    @Autowired
    private CepService cepService;

    // Metodo GET para indicar a página de busca index do CEP
    @GetMapping
    public String home(){
        return "index";
    }

    // Metodo POST para atualizar a página index com a lista
    @PostMapping("/buscar")
    public String findCep(@RequestParam String cep, Model model){

        CepDTO result = cepService.getByCep(cep);
        model.addAttribute("endereco", result);
        return "index";
    }
}
