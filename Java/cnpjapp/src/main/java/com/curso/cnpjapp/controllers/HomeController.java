package com.curso.cnpjapp.controllers;

import com.curso.cnpjapp.models.EmpresaDTO;
import com.curso.cnpjapp.repositories.ConsultaCnpjRepository;
import com.curso.cnpjapp.services.CnpjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    // Fixme - Erro: Falta de injeção de dependencia
    @Autowired
    private CnpjService service;
    @Autowired
    private ConsultaCnpjRepository repository;

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("historico", repository.findAll());

        return "index";
    }

    @PostMapping("/consultar")
    public String consultar(@RequestParam String cnpj, Model model) {

        try {

            EmpresaDTO empresa = service.consultar(cnpj);
            model.addAttribute("empresa", empresa);

        } catch (RuntimeException e) {
        }

        model.addAttribute("historico", repository.findAll());

        return "index";
    }
}