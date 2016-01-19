package br.com.agenda.ocio.dto;

import java.io.Serializable;

public class EventoDTO implements Serializable{

	public EventoDTO(){
		
	}
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String titulo;
	
	private String dataInicio;
	
	private String dataFim;
	
	private String url;
	
	private Boolean diaTodo;
	
	private Integer idUsuario;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean getDiaTodo() {
		return diaTodo;
	}

	public void setDiaTodo(Boolean diaTodo) {
		this.diaTodo = diaTodo;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
}
