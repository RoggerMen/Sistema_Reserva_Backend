package com.reserva.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="tbl_usuarios")
public class Usuarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="correo_electronico")
	private String correoElectronico;
	
	@Column(name="password")
	private String contraseña;
	
	@Column(name="rol")
	private String rol;
	
	public Usuarios() {
		// TODO Auto-generated constructor stub
	}

	public Usuarios(int id, String nombre, String correo_electronico, String contraseña, String rol, String correoElectronico) {
		this.id = id;
		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.contraseña = contraseña;
		this.rol = rol;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo_electronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
	
	
	
}
