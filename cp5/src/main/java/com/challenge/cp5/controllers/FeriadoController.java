package com.challenge.cp5.controllers;


import com.challenge.cp5.models.FeriadoDTO;
import com.challenge.cp5.services.FeriadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.Year;
import java.util.Collections;
import java.util.List;

@Controller
public class FeriadoController {

    private final FeriadoService feriadoService;

    public FeriadoController(FeriadoService feriadoService) {
        this.feriadoService = feriadoService;
    }

    @GetMapping({"/", "/feriados"})
    public String exibirPagina(
            @RequestParam(value = "ano", required = false, defaultValue = "2025") Integer ano,
            Model model
    ) {
        int anoAtual = Year.now().getValue();
        int anoSelecionado = (ano != null) ? ano : anoAtual;

        List<FeriadoDTO> feriados;
        String mensagem = null;

        try {
            if (anoSelecionado < 1900 || anoSelecionado > 2100) {
                mensagem = "Informe um ano válido entre 1900 e 2100.";
                feriados = Collections.emptyList();
            } else {
                feriados = feriadoService.buscarPorAno(anoSelecionado);
            }
        } catch (Exception e) {
            mensagem = "Não foi possível consultar os feriados no momento.";
            feriados = Collections.emptyList();
        }

        model.addAttribute("anoSelecionado", anoSelecionado);
        model.addAttribute("anoAtual", anoAtual);
        model.addAttribute("feriados", feriados);
        model.addAttribute("mensagem", mensagem);

        return "index";
    }
}