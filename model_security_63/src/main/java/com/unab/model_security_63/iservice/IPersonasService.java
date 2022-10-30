package com.unab.model_security_63.iservice;

import java.util.List;
import java.util.Optional;

import com.unab.model_security_63.entity.Personas;

public interface IPersonasService {

	public List<Personas> all();
	public Optional<Personas> findById(Integer id);
	public Personas save(Personas personas);
	public void delete(Integer id);
	
}
