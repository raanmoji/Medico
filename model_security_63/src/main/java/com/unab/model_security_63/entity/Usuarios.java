package com.unab.model_security_63.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuarios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
		    
	@Column(name = "user_name", length = 5, nullable = false)
	private String userName;
	
	@Column(name = "user_password", length = 5, nullable = false)
	private String userPassword;
	
	@Column(name = "estado", nullable = false)
	private String estado;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "persona_id", nullable = false)
	private Personas personaId;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "rol_id", nullable = false)	
	private Roles rolId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Personas getPersonaId() {
		return personaId;
	}

	public void setPersonaId(Personas personaId) {
		this.personaId = personaId;
	}

	public Roles getRolId() {
		return rolId;
	}

	public void setRolId(Roles rolId) {
		this.rolId = rolId;
	}		
	
}
