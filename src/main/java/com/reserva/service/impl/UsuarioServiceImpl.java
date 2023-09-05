package com.reserva.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reserva.models.Usuario;
import com.reserva.repositorio.IUsuarioRepositorio;
import com.reserva.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
// APLICAMOS AUTOWIRED PARA REPOSITORIO
	@Autowired
	IUsuarioRepositorio iUsuarioRepositorio;
	
	@Override
	public List<Usuario> listarUsuario() {
		// RETORNAMOS EL METODO FINDALL DEL REPOSITORIO PARA PODER LISTAR
		return iUsuarioRepositorio.findAll();
	}

	@Override
	public Usuario registrarUsuario(Usuario usu) {
		// RETORNAMOS EL METODO SAVE DEL REPOSITORIO PARA PODER INSERTAR
		return iUsuarioRepositorio.save(usu);
	}

}
