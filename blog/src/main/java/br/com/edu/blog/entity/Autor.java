package br.com.edu.blog.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "autores")
public class Autor extends AbstractPersistable<Long>{

	
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, unique = true, length = 25)
	private String nome;
	
	@Column(nullable = false, length = 255)
	private String biografia;
	
	@OneToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	@OneToMany(mappedBy="autor")
	private List<Postagem> postagens;
	
	public List<Postagem> getPostagens() {
		return postagens;
	}
	
	public void setPostagens(List<Postagem> postagens) {
		this.postagens = postagens;
	}
	
	@Override
	public void setId(Long id) {
		super.setId(id);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	 
}
