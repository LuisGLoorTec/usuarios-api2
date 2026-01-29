package com.istlc.backend.usuarios_api.repository;

import com.istlc.backend.usuarios_api.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
