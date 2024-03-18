package io.github.edersombarros.clientes.exception;

public class UsuarioCadastradoException extends RuntimeException {
    public UsuarioCadastradoException(String login) {
        super("Usuário já Cadastrado para o login " + login);
    }
}
