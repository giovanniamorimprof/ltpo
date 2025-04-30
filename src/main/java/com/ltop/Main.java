package com.ltop;
import com.ltop.DAO.UsuarioDAO;
import com.ltop.models.Usuario;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        // Inserir um novo usuário
        Usuario usuario = new Usuario("João", "joao@example.com");
        usuarioDAO.salvar(usuario);
        System.out.println("Usuário inserido: " + usuario);

        // Buscar todos os usuários
        List<Usuario> usuarios = usuarioDAO.buscarTodos();
        System.out.println("\nTodos os usuários:");
        for (Usuario u : usuarios) {
            System.out.println(u);
        }

        // Buscar um usuário por ID
        Usuario usuarioBuscado = usuarioDAO.buscarPorId(1);
        System.out.println("\nUsuário com ID 1: " + usuarioBuscado);

        // Fechar o EntityManager
        usuarioDAO.fechar();
    }
}
