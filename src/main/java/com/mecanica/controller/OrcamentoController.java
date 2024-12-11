package com.mecanica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrcamentoController {

    // Rota para o botão "Orçamento Rápido"
    @GetMapping("/orcamento")
    public String orcamentoRapido() {
        return "orcamento"; // Nome da página HTML (orcamento.html)
    }
}
