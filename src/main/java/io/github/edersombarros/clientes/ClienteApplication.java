package io.github.edersombarros.clientes;

import io.github.edersombarros.clientes.model.entity.Cliente;
import io.github.edersombarros.clientes.model.repository.ClienteRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClienteApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClienteApplication.class,args);

    }
}
