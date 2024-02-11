package io.github.edersombarros.clientes.model.repository;

import io.github.edersombarros.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
