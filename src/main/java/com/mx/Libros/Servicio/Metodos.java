package com.mx.Libros.Servicio;

import java.util.List;

import com.mx.Libros.Dominio.Libros;

public interface Metodos {

	public void guardar(Libros libro);
	public void editar(Libros libro);
	public void eliminar(Libros libro);

	public Libros buscar(Libros libro);
	public List<Libros> listar();

}
