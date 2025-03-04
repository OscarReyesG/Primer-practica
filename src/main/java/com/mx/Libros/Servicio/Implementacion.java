package com.mx.Libros.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.mx.Libros.Dao.LibrosDao;
import com.mx.Libros.Dominio.Libros;

import jakarta.transaction.Transactional;

@Service
public class Implementacion implements Metodos {

	@Autowired //Objeto //bean
	LibrosDao dao;
	
	@Override
	public void guardar(Libros libro) {

		if(listar().isEmpty()) {
			dao.save(libro);
		}else {
			dao.save(libro);
		}
	}

	@Override
	public void editar(Libros libro) {
		if(listar().isEmpty()) {
			System.out.println("No existen libros a editar");
		}else {
			dao.save(libro);
		}		
	}

	@Override
	public void eliminar(Libros libro) {
		if(listar().isEmpty()) {
			System.out.println("No existen libros a eliminar");
		}else {
			dao.delete(libro);
		}
	}

	@Override
	public Libros buscar(Libros libro) {
		return dao.findById(libro.getId()).orElse(null);
	}

	@Override
	public List<Libros> listar() {
		return (List<Libros>) dao.findAll();
	}
	
	//---------------QUERYS-------------------
	@Transactional
	@Modifying
	public List<Libros> findByNombre(Libros libro){
		return dao.findByNombreEscuela(libro.getNombreEscuela());
	}
	
	
	@Transactional
	@Modifying
	public List<Libros> findByAutor(String autor){
		return dao.findByAutor(autor);
	}
	
	@Transactional
	@Modifying
	public void deleteByNombreEscuela(Libros libro) {
		dao.deleteByNombreEscuela(libro.getNombreEscuela());
		System.out.println("Eliminado");
	}
	




}
