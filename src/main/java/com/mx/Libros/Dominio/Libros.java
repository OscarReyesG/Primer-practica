package com.mx.Libros.Dominio;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BIBLIOTECA_2025")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Libros {

	/*CREATE TABLE BIBLIOTECA_2025(
ID NUMBER PRIMARY KEY,
NOMBRE_ESCUELA NVARCHAR2(50),
NOMBRE_LIBRO NVARCHAR2(50),
FECHA_PUBLICACION DATE,
AUTOR NVARCHAR2(50),
NUMERO_PAGINAS NUMBER,
CLASIFICACION NVARCHAR2(50),
CANTIDAD NUMBER,
PRECIO NUMBER
);*/
	
	@Id
	int id;
	@Column(name = "NOMBRE_ESCUELA")
	String nombreEscuela;
	@Column(name = "NOMBRE_LIBRO")
	String nombreLibro;
	@Column(name = "FECHA_PUBLICACION")
	@JsonFormat(pattern = "dd/MM/yyyy")
	Date fechaPublicacion;
	String autor;
	@Column(name = "NUMERO_PAGINAS")
	int numPaginas;
	String clasificacion;
	int cantidad;
	double precio;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreEscuela() {
		return nombreEscuela;
	}
	public void setNombreEscuela(String nombreEscuela) {
		this.nombreEscuela = nombreEscuela;
	}
	public String getNombreLibro() {
		return nombreLibro;
	}
	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}
	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
