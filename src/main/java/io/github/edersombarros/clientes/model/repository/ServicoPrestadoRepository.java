package io.github.edersombarros.clientes.model.repository;

import io.github.edersombarros.clientes.model.entity.ServicoPrestado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoPrestadoRepository extends JpaRepository<ServicoPrestado, Long> {
}
