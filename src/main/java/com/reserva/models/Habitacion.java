package com.reserva.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="tbl_habitaciones")
public class Habitacion {

	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	@Column (name="id")
	private int id;
	
	@Column (name="cod_habitacion")
	private String codHabitacion;
	
	@Column (name="tipo_habitacion")
	private String tipoHabitacion;
	
	@Column (name="precio")
	private double precio;
	
	@Column (name="descripcion")
	private String descripcion;
	
	@Column (name="imagen")
	private String imagen;
	
	public Habitacion() {
		// TODO Auto-generated constructor stub
	}

	public Habitacion(int id, String codHabitacion, String tipoHabitacion, double precio, String descripcion,
			String imagen) {
		super();
		this.id = id;
		this.codHabitacion = codHabitacion;
		this.tipoHabitacion = tipoHabitacion;
		this.precio = precio;
		this.descripcion = descripcion;
		this.imagen = imagen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodHabitacion() {
		return codHabitacion;
	}

	public void setCodHabitacion(String codHabitacion) {
		this.codHabitacion = codHabitacion;
	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
	
}
