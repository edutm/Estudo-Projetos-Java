package br.com.edu.blog.service;

import org.springframework.web.multipart.MultipartFile;

import br.com.edu.blog.entity.Avatar;

public interface AvatarService {
	
	public void salvarOuAtualizar(Avatar avatar);
	
	public Avatar getFileUpload(MultipartFile file);

}
