package com.mecanica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Mapeia a URL raiz para redirecionar para a página 'index'
    @GetMapping("/")
    public String home() {
        return "index"; // Exibe a página principal (index.html)
    }

    @GetMapping("/quem-somos")
    public String quemSomos() {
        return "quemSomos"; // Página 'quem somos'
    }

    @GetMapping("/servicos")
    public String servicos() {
        return "servicos"; // Página 'serviços'
    }

    @GetMapping("/depoimentos")
    public String depoimentos() {
        return "depoimentos"; // Página 'depoimentos'
    }

    @GetMapping("/orcamento")
    public String orcamento() {
        return "orcamento"; // Página 'orcamento'
    }

    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro"; // Página de cadastro
    }
}