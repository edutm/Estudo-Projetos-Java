package br.com.edu.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.edu.blog.entity.Autor;
import br.com.edu.blog.repository.AutorRepository;
import br.com.edu.blog.service.AutorService;

@Service
@Transactional(readOnly=true, propagation = Propagation.REQUIRED)
public class AutorServiceImpl implements AutorService {

	@Autowired
	private AutorRepository autorRepository;
	
	public Autor buscarPorId(Long id) {
		return autorRepository.findOne(id);
	}

	public Autor buscarPorNome(String nome) {
		return autorRepository.findByNome(nome);
	}

	public List<Autor> buscarTodos() {
		return autorRepository.findAll();
	}

	@Transactional(readOnly=false)
	public void salvar(Autor autor) {
		
		if(autor.getId() == null){
			autorRepository.save(autor);
		} else {
			autorRepository.updateNomeEBiografia(autor.getNome(), autor.getBiografia(), autor.getId());
		}
	}

	@Transactional(readOnly=false)
	public void deletar(long id) {
		autorRepository.delete(id);
	}

}
