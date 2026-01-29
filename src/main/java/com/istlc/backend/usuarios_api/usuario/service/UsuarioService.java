package com.istlc.backend.usuarios_api.usuario.service;

import com.istlc.backend.usuarios_api.usuario.dto.UsuarioDto;
import com.istlc.backend.usuarios_api.usuario.entity.Usuario;
import com.istlc.backend.usuarios_api.usuario.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository){
        this.repository = repository;
    }

    public Usuario crear(Usuario usuario){
        return repository.save(usuario);
    }

    public List<Usuario> listar() {
        return repository.findAll();
    }

    public Usuario obtener(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Usuario actualizar(Long id, Usuario usuario){
        usuario.setId(id);
        return repository.save(usuario);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
    public UsuarioDto toDto(Usuario u){
        if (u == null) return null;
        UsuarioDto dto = new UsuarioDto();
        dto.setId(u.getId());
        dto.setNombre(u.getNombre());
        dto.setCorreo(u.getCorreo());
        dto.setActivo(u.getActivo());
        return dto;

    }
}
