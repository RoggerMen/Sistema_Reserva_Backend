package com.reserva.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="tbl_usuarios")
public class Usuario {

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
	
	@ManyToOne
	@JoinColumn(name="id_habitacion")
	private Habitacion idHabitacion;
	

	public Usuario() {
		// TODO Auto-generated constructor stub
	}


	public Usuario(int id, String nombre, String correoElectronico, String contraseña, String rol,
			Habitacion idHabitacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.contraseña = contraseña;
		this.rol = rol;
		this.idHabitacion = idHabitacion;
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


	public String getCorreoElectronico() {
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


	public Habitacion getIdHabitacion() {
		return idHabitacion;
	}


	public void setIdHabitacion(Habitacion idHabitacion) {
		this.idHabitacion = idHabitacion;
	}
	
	
}
