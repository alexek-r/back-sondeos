package com.sondeos.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sondeos.app.model.Nota;
import com.sondeos.app.service.INotaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200") //  the annotation enables Cross-Origin Resource Sharing (CORS) on the server.
public class NotaRestController {
	
	@Autowired
	private INotaService notaService;
	
	@GetMapping("/listarNotas")
	public List<Nota> listarNotas(){
		return notaService.findAll();
	}
	
	@PostMapping("/guardarNota")
	@ResponseStatus(HttpStatus.CREATED)
	public Nota save(@RequestBody Nota nota) {
		return notaService.save(nota);
	}
	
	@GetMapping("/nota/{id}")
	public Nota buscarNota(@PathVariable Integer id) {
		return notaService.FindById(id);
	}
	
	
	@DeleteMapping("borrar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrarNota(@PathVariable Integer id) {
		notaService.delete(id);
	}
	

}
