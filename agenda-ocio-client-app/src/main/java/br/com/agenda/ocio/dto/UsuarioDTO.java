package br.com.agenda.ocio.dto;

import java.io.Serializable;

public class UsuarioDTO implements Serializable{
	
	public UsuarioDTO(){
		
	}
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String nome;
	
	private String usuario;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	

}
