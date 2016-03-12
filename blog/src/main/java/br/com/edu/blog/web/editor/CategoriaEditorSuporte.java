package br.com.edu.blog.web.editor;

import java.util.Collection;

import org.springframework.beans.propertyeditors.CustomCollectionEditor;

import br.com.edu.blog.entity.Categoria;
import br.com.edu.blog.service.CategoriaService;

public class CategoriaEditorSuporte extends CustomCollectionEditor{

	private CategoriaService service;
	
	public CategoriaEditorSuporte(Class<? extends Collection> collectionType, CategoriaService service) {
		super(collectionType);
		this.service = service;
	}

	@Override
	protected Object convertElement(Object element) {
		
		Categoria categoria = service.buscarPorId(Long.valueOf((String)element));
		return super.convertElement(categoria);
	}
	
	

}
