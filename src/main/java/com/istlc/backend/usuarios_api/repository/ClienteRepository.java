package com.istlc.backend.usuarios_api.repository;

import com.istlc.backend.usuarios_api.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
