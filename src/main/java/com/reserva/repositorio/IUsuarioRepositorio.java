package com.reserva.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reserva.models.Usuario;

public interface IUsuarioRepositorio extends JpaRepository<Usuario, Integer> {

}
