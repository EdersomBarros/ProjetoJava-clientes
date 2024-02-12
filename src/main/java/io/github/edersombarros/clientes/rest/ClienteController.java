package io.github.edersombarros.clientes.rest;

import io.github.edersombarros.clientes.model.entity.Cliente;
import io.github.edersombarros.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteRepository repository;

    @Autowired
    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar(@RequestBody @Valid Cliente cliente) {
        return repository.save(cliente);
    }
    @GetMapping("{id}")
    public Cliente acharPorId(@PathVariable Long id){
        return repository.findById(id).orElseThrow(
                () ->new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado"));
    }
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long id){
        repository.findById(id)
                .map( cliente -> {
                    repository.delete(cliente);
                    return Void.TYPE;
                })
                .orElseThrow(
                () ->new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado"));
    }
    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizar(@PathVariable Long id, @RequestBody @Valid Cliente clienteAtualizado){
        repository.findById(id)
                .map( cliente -> {
                   cliente.setNome(clienteAtualizado.getNome());
                   cliente.setCpf(clienteAtualizado.getCpf());
                    return repository.save(clienteAtualizado);
                })
                .orElseThrow(
                        () ->new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado"));

    }

}
