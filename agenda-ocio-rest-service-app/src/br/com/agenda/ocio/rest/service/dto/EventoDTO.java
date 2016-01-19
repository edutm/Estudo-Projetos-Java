package br.com.agenda.ocio.rest.service.dto;

import java.util.Calendar;

import com.google.gson.Gson;

import br.com.agenda.ocio.model.Usuario;

public class EventoDTO {
	
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
	
	public String toJson() {
		return new Gson().toJson(this);
	}

}
