package com.unab.model_security_63.entity;

import javax.persistence.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "personas")
public class Personas{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
		    
	@Column(name = "tipo_documento", length = 5, nullable = false)
	private String TipoDocumento;

	@Column(name = "documento", length = 15, nullable = false, unique = true)
	private String Documento;
	
	@Column(name = "primer_nombre", length = 15, nullable = false)
	private String PrimerNombre;
	
	@Column(name = "segundo_nombre", length = 15, nullable = false)
	private String SegundoNombre;
	
	@Column(name = "primer_apellido", length = 15, nullable = false)
	private String PrimerApellido;
	
	@Column(name = "segundo_apellido", length = 15, nullable = false)
	private String SegundoApellido;
	
	@Column(name = "correo", length = 15, nullable = false)
	private String correo;
	
	@Column(name = "telefono", length = 15, nullable = false)
	private String telefono;
	
	@Column(name = "estado", nullable = false)
	private String Estado;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getTipoDocumento() {
		return TipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		TipoDocumento = tipoDocumento;
	}

	public String getDocumento() {
		return Documento;
	}

	public void setDocumento(String documento) {
		Documento = documento;
	}

	public String getPrimerNombre() {
		return PrimerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		PrimerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return SegundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		SegundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return PrimerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		PrimerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return SegundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		SegundoApellido = segundoApellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}
	
	
}
