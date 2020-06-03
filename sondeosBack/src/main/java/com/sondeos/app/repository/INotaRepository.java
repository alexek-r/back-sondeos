package com.sondeos.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.sondeos.app.model.Nota;

public interface INotaRepository extends CrudRepository<Nota, Integer> {

	
}
