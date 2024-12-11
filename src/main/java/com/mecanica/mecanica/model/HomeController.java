package com.mecanica.mecanica.model;
 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    // Método para carregar a tela de cadastro
    @GetMapping("/")
    public String cadastro() {
        return "cadastro"; // Exibe a página de cadastro
    }

    // Método para processar o cadastro
    @PostMapping("/cadastrar")
    public String cadastrar(@RequestParam("nome") String nome, 
                            @RequestParam("email") String email,
                            @RequestParam("telefone") String telefone,
                            Model model) {
        // Aqui você pode salvar os dados no banco ou apenas exibir
        model.addAttribute("nome", nome);
        model.addAttribute("email", email);
        model.addAttribute("telefone", telefone);

        // Exibe uma página de sucesso após o cadastro
        return "sucesso"; // Crie uma página de sucesso, se necessário
    }
}