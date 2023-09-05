package com.reserva.service;

import java.util.List;

import com.reserva.models.Usuario;

public interface IUsuarioService {
	// Para listar Usuarios
	public List<Usuario> listarUsuario();
	
	// Para agregar al Usuario
	public Usuario registrarUsuario(Usuario usu);

}
