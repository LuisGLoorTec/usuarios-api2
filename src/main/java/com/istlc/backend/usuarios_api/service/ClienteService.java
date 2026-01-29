package com.istlc.backend.usuarios_api.service;

import com.istlc.backend.usuarios_api.entity.Cliente;
import com.istlc.backend.usuarios_api.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository){
        this.repository = repository;
    }

    public Cliente crear(Cliente cliente){
        return repository.save(cliente);
    }

    public List<Cliente> listar() {
        return repository.findAll();
    }

    public Cliente obtener(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Cliente actualizar(Long id, Cliente cliente){
        cliente.setId(id);
        return repository.save(cliente);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
