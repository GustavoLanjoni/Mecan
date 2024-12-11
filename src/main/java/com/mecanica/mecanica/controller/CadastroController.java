package com.mecanica.mecanica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CadastroController {

    // Exibe a página de cadastro
    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro"; // Retorna o arquivo cadastro.html
    }

    // Processa o envio do formulário de cadastro
    @PostMapping("/cadastro")
    public String cadastrar(@RequestParam("nome") String nome, 
                            @RequestParam("email") String email,
                            @RequestParam("cpf") String cpf,
                            @RequestParam("senha") String senha,
                            Model model) {
        
        // Aqui você pode salvar os dados no banco de dados ou apenas exibir os dados
        // Adicionando os dados ao modelo para exibir na página de sucesso
        model.addAttribute("nome", nome);
        model.addAttribute("email", email);
        model.addAttribute("cpf", cpf);
        
        // Retornamos uma página de sucesso com os dados do cadastro
        return "sucesso"; // Crie uma página de sucesso com essas informações
    }
}