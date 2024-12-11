package com.mecanica.controller;

import com.mecanica.model.Usuario;
import com.mecanica.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public Usuario login(@RequestParam String email, @RequestParam String senha) {
        Usuario usuario = usuarioService.buscarPorEmail(email);
        if (usuario != null && usuario.getSenha().equals(senha)) {
            return usuario; // Retornar usuário caso a senha esteja correta
        }
        return null; // Senha incorreta
    }

    @PostMapping("/cadastro")
    public Usuario cadastro(@RequestBody Usuario usuario) {
        return usuarioService.salvarUsuario(usuario); // Salvar novo usuário
    }
}
