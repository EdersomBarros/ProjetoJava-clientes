package io.github.edersombarros.clientes.model.repository;

import io.github.edersombarros.clientes.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
