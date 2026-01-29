package com.istlc.backend.usuarios_api.usuario.controller;

import com.istlc.backend.usuarios_api.usuario.dto.UsuarioDto;
import com.istlc.backend.usuarios_api.usuario.entity.Usuario;
import com.istlc.backend.usuarios_api.usuario.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
    public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping
    public Usuario crear(@RequestBody Usuario usuario) {
        return service.crear(usuario);
    }

    @GetMapping
    public List<UsuarioDto> listar() {
        return service.listar()
                .stream()
                .map(service::toDto)
                .toList();
    }

    @GetMapping("/{id}")
    public UsuarioDto obtener(@PathVariable Long id) {
        return service.toDto(service.obtener(id));
    }

    @PutMapping("/{id}")
    public Usuario actualizar(@PathVariable Long id, @RequestBody Usuario usuario) {
        return service.actualizar(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}