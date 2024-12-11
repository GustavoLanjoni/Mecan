package com.mecanica.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrcamentoController {

    @GetMapping("/")
    public String index() {
        return "index"; // Carrega o arquivo index.html
    }

    @GetMapping("/orcamento")
    public String orcamentoRapido() {
        return "orcamento"; // Carrega o arquivo orcamento.html
    }
}