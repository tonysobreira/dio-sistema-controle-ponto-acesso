package com.dio.live.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.live.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
