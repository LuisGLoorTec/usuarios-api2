package com.istlc.backend.usuarios_api.usuario.repository;

import com.istlc.backend.usuarios_api.usuario.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
