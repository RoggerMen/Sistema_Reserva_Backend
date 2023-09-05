package com.reserva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reserva.models.Usuario;
import com.reserva.service.IUsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	IUsuarioService iUsuarioService;
	
	// OBTENEMOS EL LISTAR DEL SERVICE PARA PODER RETORNAR LOS DATOS 
	@GetMapping
	public List<Usuario> listarUsuario(){
		
		List<Usuario> listUsu = iUsuarioService.listarUsuario();
		
		return listUsu;
		
	}
	
	@PostMapping
	public Usuario registrarUsuario(@RequestBody Usuario u) {
		
		Usuario usuario = iUsuarioService.registrarUsuario(u);
		
		return usuario;
		
	}
	
	

}
