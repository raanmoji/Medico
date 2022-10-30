package com.unab.model_security_63.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vistas")
public class VistasRoles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "rol_id", nullable = false)	
	private Roles rolId;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "vista_id", nullable = false)	
	private Vistas vistaId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Roles getRolId() {
		return rolId;
	}

	public void setRolId(Roles rolId) {
		this.rolId = rolId;
	}

	public Vistas getVistaId() {
		return vistaId;
	}

	public void setVistaId(Vistas vistaId) {
		this.vistaId = vistaId;
	}
	
}
