package com.mecanica.service;

import org.springframework.stereotype.Service;
import com.mecanica.model.Usuario;

@Service
public class UsuarioService {

    public void salvarUsuario(Usuario usuario) {
        // Aqui você pode salvar o usuário em um banco de dados ou realizar outras operações
        System.out.println("Usuário salvo: " + usuario.getNome());
    }
}