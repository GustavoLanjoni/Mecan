package com.mecanica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mecanica.model.Usuario;
import com.mecanica.service.UsuarioService;

@Controller
public class CadastroController {

    private final UsuarioService usuarioService;

    public CadastroController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // Mapeia a requisição GET para a página inicial (redireciona para o cadastro)
    @GetMapping("/")
    public String redirecionarParaCadastro() {
        return "redirect:/cadastro";  // Redireciona para a página de cadastro
    }

    // Mapeia a requisição GET para exibir o formulário de cadastro
    @GetMapping("/cadastro")
    public String exibirFormularioCadastro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "cadastro";  // Nome do arquivo HTML em templates
    }

    // Mapeia o POST para processar o formulário de cadastro
    @PostMapping("/cadastro")
    public String processarCadastro(Usuario usuario) {
        usuarioService.salvarUsuario(usuario);
        return "redirect:/sucesso";  // Redireciona após o sucesso
    }
}
