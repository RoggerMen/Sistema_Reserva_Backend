package com.reserva.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name="usuario_reserva")
public class UsuarioReserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id")
	private int id;
	
	@OneToMany
	@JoinColumn (name="id_usuario")
	private Usuarios usuario;
	
	@OneToMany
	@JoinColumn (name="id_reservas")
	private Reservas reserva;
	
	public UsuarioReserva() {
		// TODO Auto-generated constructor stub
	}

	public UsuarioReserva(int id, Usuarios usuario, Reservas reserva) {
		this.id = id;
		this.usuario = usuario;
		this.reserva = reserva;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	public Reservas getReserva() {
		return reserva;
	}

	public void setReserva(Reservas reserva) {
		this.reserva = reserva;
	}
	
	
	
}
