package com.ltop.DAO;

import com.ltop.models.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class UsuarioDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public UsuarioDAO() {
        emf = Persistence.createEntityManagerFactory("usuarioPU");
        em = emf.createEntityManager();
    }

    // Método para salvar um novo usuário
    public void salvar(Usuario usuario) {
        try {
            // Inicia a transação
            em.getTransaction().begin();

            // Persiste o usuário
            em.persist(usuario);

            // Comita a transação
            em.getTransaction().commit();
        } catch (Exception e) {
            // Em caso de erro, faz rollback da transação
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace(); // Opcional: Adicione um log ou uma mensagem adequada
        }
    }


    // Método para buscar todos os usuários
    public List<Usuario> buscarTodos() {
        return em.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
    }

    // Método para buscar usuário por ID
    public Usuario buscarPorId(int id) {
        return em.find(Usuario.class, id);
    }

    // Fechar a conexão com o banco
    public void fechar() {
        em.close();
        emf.close();
    }
}
