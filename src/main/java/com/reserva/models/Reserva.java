package com.reserva.models;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

@Entity
@Table (name="tbl_reservas")
public class Reserva {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name="id")
	private int id;
	
	@Column(name="fecha_entrada")
	private Date fechaEntrada; 
	
	@Column(name="fecha_salida")
	private Date fechaSalida;
	
	@Column(name="estado")
	private boolean Estado;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "usuario_reservas", joinColumns = @JoinColumn(name = "id_reserva"), inverseJoinColumns = @JoinColumn(name = "id_usuario"))
	
	private Set<Usuario> usuarios = new HashSet<Usuario>();
	
	
	public Reserva() {
		// TODO Auto-generated constructor stub
	}


	public Reserva(int id, Date fechaEntrada, Date fechaSalida, boolean estado, Set<Usuario> usuarios) {
		super();
		this.id = id;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		Estado = estado;
		this.usuarios = usuarios;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getFechaEntrada() {
		return fechaEntrada;
	}


	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}


	public Date getFechaSalida() {
		return fechaSalida;
	}


	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}


	public boolean isEstado() {
		return Estado;
	}


	public void setEstado(boolean estado) {
		Estado = estado;
	}


	public Set<Usuario> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	
	
}
