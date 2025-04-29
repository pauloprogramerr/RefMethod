package anotations.spring;

import anotations.jpa.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

interface UsuarioReposutory extends JpaRepository<Usuario, Long> {
}