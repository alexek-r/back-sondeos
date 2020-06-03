package com.sondeos.app.service;

import java.util.List;

import com.sondeos.app.model.Nota;

public interface INotaService {

	public List<Nota> findAll();
	
	public Nota FindById(Integer id);
	
	public Nota save(Nota nota);
	
	public void delete(Integer id);
	
}
