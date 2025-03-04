package com.mx.Libros.Dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.Libros.Dominio.Libros;

@Repository
public interface LibrosDao extends CrudRepository<Libros, Integer> {

	/*contiene metodos comunes, tambien permite personalizar querys
	 * para que las busquedas sean mas rapidas
	 * NOTA: cuando se personaliza querys se acompaña de anotaciones como transacional, modifynig
	 * estas van del lado de la implementacion*/
	
	//buscar por NOMBRE DE LA ESCUELA
	
	public List<Libros> findByNombreEscuela(String nombreEscuela);
	
	//buscar por autor
	
	public List<Libros> findByAutor(String autor);
	
	//buscar por clasificacion
	public List<Libros> findByClasificacion(String clasificacion);

	//buscar por precio 
	public List<Libros> findAllByPrecio(double precio);

	//buscar por fecha de publicacion
	public List<Libros> findAllByFechaPublicacion(Date fechaPublicacion);
	
	//eliminar por nombre void delteById(ID id)
	public void deleteByNombreEscuela(String nombreEscuela);
	
	//eliminar todo -- clean void deleteAllById(iterable)
	public void deleteAllByClasificacion(String clasificacion);

}
