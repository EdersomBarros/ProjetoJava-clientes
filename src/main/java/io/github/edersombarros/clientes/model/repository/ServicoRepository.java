package io.github.edersombarros.clientes.model.repository;

import io.github.edersombarros.clientes.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
}
