package br.com.edu.blog.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.omg.CORBA.PERSIST_STORE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.edu.blog.entity.Postagem;
import br.com.edu.blog.repository.PostagemRepository;
import br.com.edu.blog.service.PostagemService;
import br.com.edu.blog.util.MyStringReplace;

@Service
@Transactional(readOnly=true, propagation=Propagation.REQUIRED)
public class PostagemServiceImpl implements PostagemService {

	@Autowired
	private PostagemRepository postagemRepository;
	
	@Transactional(readOnly=false)
	public void salvarOuAtualizar(Postagem postagem) {
		if(postagem.getId() == null){
			this.salvar(postagem);
		}else{
			this.update(postagem);
		}
		
	}

	private void update(Postagem postagem) {
		
		Postagem persistir = postagemRepository.findOne(postagem.getId());
		
		if(!persistir.getTitulo().equals(postagem.getTitulo())){
			persistir.setTitulo(postagem.getTitulo());
		}
		
		if(!persistir.getTexto().equals(postagem.getTexto())){
			persistir.setTexto(postagem.getTexto());
		}
		
		if(persistir.getCategorias() != postagem.getCategorias()){
			persistir.setCategorias(postagem.getCategorias());
		}
		postagemRepository.save(persistir);
	}

	private void salvar(Postagem postagem) {
		postagem.setDataPostagem(LocalDateTime.now());
		String formatarPermalink = MyStringReplace.formatarPermalink(postagem.getTitulo());
		postagem.setPermalink(formatarPermalink);
		postagemRepository.save(postagem);
	}

	public Postagem buscarPorId(Long id) {
		return postagemRepository.findOne(id);
	}

	public Postagem buscarPorPermalink(String permalink) {
		return postagemRepository.findByPermalink(permalink);
	}

	public List<Postagem> buscarTodos() {
		return postagemRepository.findAll();
	}

	@Transactional(readOnly=false)
	public void deletar(Long id) {
		postagemRepository.delete(id);
		
	}

}
