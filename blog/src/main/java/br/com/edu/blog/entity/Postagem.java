package br.com.edu.blog.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "postagens")
public class Postagem extends AbstractPersistable<Long>{

	private static final long serialVersionUID = 1L;

	@Column(unique = true, nullable=false, length = 60)
	private String titulo;
	
	@Column(nullable=false, columnDefinition="LONGTEXT")
	private String texto;

	@Column(unique = true, nullable=false, length = 60)
	private String permalink;
	
	@DateTimeFormat(iso=ISO.DATE_TIME, pattern="dd-MM-yyyy'T'HH:mm:ss")
	@Column(name="data_postagem", nullable= false)
	private LocalDateTime dataPostagem;
	
	@ManyToOne
	@JoinColumn(name="autor_id")
	private Autor autor;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(
		name = "postagens_has_categorias",
		joinColumns = @JoinColumn(name = "postagem_id"),
		inverseJoinColumns = @JoinColumn(name = "categoria_id")
	)
	private List<Categoria> categorias;
	
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	
	public List<Categoria> getCategorias() {
		return categorias;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getPermalink() {
		return permalink;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	public LocalDateTime getDataPostagem() {
		return dataPostagem;
	}

	public void setDataPostagem(LocalDateTime dataPostagem) {
		this.dataPostagem = dataPostagem;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	@Override
	public void setId(Long id) {
		super.setId(id);
	}
	
}
