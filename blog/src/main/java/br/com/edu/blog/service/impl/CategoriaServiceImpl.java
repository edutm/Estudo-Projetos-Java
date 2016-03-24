package br.com.edu.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.edu.blog.entity.Categoria;
import br.com.edu.blog.repository.CategoriaRepository;
import br.com.edu.blog.service.CategoriaService;
import br.com.edu.blog.util.MyStringReplace;

@Service
@Transactional(readOnly=true , propagation = Propagation.REQUIRED)
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	@Transactional(readOnly=false)
	public void salvar(Categoria categoria) {
		
		categoria.setPermalink(
				MyStringReplace.formatarPermalink(
						categoria.getDescricao()));;
		
		repository.save(categoria);
	}

	@Transactional(readOnly=false)
	public void deletar(Long id) {
		repository.delete(id);
	}

	public Categoria buscarPorId(Long id) {
		return repository.findOne(id);
	}

	public Categoria buscarPorCategoria(String descricao) {
		return repository.findByDescricao(descricao);
	}

	public List<Categoria> buscarTodos() {
		Sort sort = new Sort(Direction.ASC, "descricao");
		return repository.findAll(sort);
	}

}
