package com.unab.model_security_63.iservice;

import java.util.List;
import java.util.Optional;

import com.unab.model_security_63.entity.Roles;

public interface IRolesService {
	public List<Roles> all();
	public Optional<Roles> findById(Integer id);
	public Roles save(Roles roles);
	public void delete(Integer id);
}
