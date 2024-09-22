package com.eventos_api.repositories.organizador;

import com.eventos_api.entities.organizador.Organizador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizadorRepository extends JpaRepository<Organizador, String> {
}
