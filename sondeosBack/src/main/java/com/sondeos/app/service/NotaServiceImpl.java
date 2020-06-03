package com.sondeos.app.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sondeos.app.model.Nota;
import com.sondeos.app.repository.INotaRepository;


@Service
public class NotaServiceImpl implements INotaService {
	
	@Autowired
	private INotaRepository notaRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Nota> findAll() {
		List<Nota> listaNotas = (List<Nota>) notaRepository.findAll();
		return listaNotas;
	}

	@Override
	@Transactional(readOnly = true)
	public Nota FindById(Integer id) {
		Nota nota = notaRepository.findById(id).orElse(null);
		return nota;
	}
	
	@Override
	@Transactional
	public Nota save(Nota nota) {
		Nota nuevaNota = notaRepository.save(nota);
		return nuevaNota;
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		notaRepository.deleteById(id);
	}



}
