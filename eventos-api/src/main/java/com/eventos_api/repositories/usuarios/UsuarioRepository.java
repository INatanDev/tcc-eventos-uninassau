package com.eventos_api.repositories.usuarios;

import com.eventos_api.entities.user.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuarios, String> {

    Optional<Usuarios> findByEmail(String email);
}
