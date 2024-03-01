package io.github.edersombarros.clientes.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, name = "login")  //usuário único
    @NotEmpty(message = "{campo.login.obrigatorio}")
    private String username;
    @Column(name = "senha")
    @NotEmpty(message = "{campo.senha.obrigatorio}")
    private String password;
}
