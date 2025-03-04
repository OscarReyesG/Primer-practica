package com.mx.Libros.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Libros.Dominio.Libros;
import com.mx.Libros.Servicio.Implementacion;

@RestController
@RequestMapping(path = "WebService")
@CrossOrigin("*")
public class WebService {
	
	@Autowired
	Implementacion imp;
	
	@RequestMapping(value = "listar", method = RequestMethod.GET)
	public ResponseEntity<List<Libros>> listar(){
		return ResponseEntity.status(HttpStatus.CREATED).body(imp.listar());
	}
	
	@RequestMapping(value = "guardar", method = RequestMethod.POST)
	public ResponseEntity<?> guardar (@RequestBody Libros libro){
		imp.guardar(libro);
		return new ResponseEntity<String>("Success: OK",HttpStatus.OK);
	}
	
	@RequestMapping(value = "editar", method = RequestMethod.POST)
	public ResponseEntity<?> editar (@RequestBody Libros libro){
		imp.editar(libro);
		return new ResponseEntity<String>("Success: Update",HttpStatus.OK);
	}
	
	@RequestMapping(value = "eliminar", method = RequestMethod.POST)
	public ResponseEntity<?> eliminar (@RequestBody Libros libro){
		imp.eliminar(libro);
		return new ResponseEntity<String>("Success: DELETE",HttpStatus.OK);
	}
	
	@RequestMapping(value = "buscar", method = RequestMethod.POST)
	public ResponseEntity<?> buscar (@RequestBody Libros libro){
		return ResponseEntity.status(HttpStatus.CREATED).body(imp.buscar(libro));

	}
	
	@RequestMapping(value = "buscarEscuela", method = RequestMethod.POST)
	public ResponseEntity<?> buscarEscuela (@RequestBody Libros libro){
		return ResponseEntity.status(HttpStatus.CREATED).body(imp.findByNombre(libro));

	}
	
	@RequestMapping(value = "eliminarEscuela", method = RequestMethod.POST)
	public ResponseEntity<?> eliminarEscuela (@RequestBody Libros libro){
		imp.deleteByNombreEscuela(libro);
		return new ResponseEntity<String>("Success: DELETE",HttpStatus.OK);
	}
	
}
