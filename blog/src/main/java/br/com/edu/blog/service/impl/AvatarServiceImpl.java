package br.com.edu.blog.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import br.com.edu.blog.entity.Avatar;
import br.com.edu.blog.repository.AvatarRepository;
import br.com.edu.blog.service.AvatarService;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class AvatarServiceImpl implements AvatarService {

	@Autowired
	private AvatarRepository avatarRepository;

	@Transactional(readOnly = false)
	public void salvarOuAtualizar(Avatar avatar) {
		avatarRepository.save(avatar);
	}

	public Avatar getFileUpload(MultipartFile file) {

		Avatar avatar = new Avatar();

		if (file != null && file.getSize() > 0) {
			try {
				avatar.setTitulo(file.getOriginalFilename());
				avatar.setTipo(file.getContentType());
				avatar.setAvatar(file.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return avatar;
	}

	public Avatar getFindById(Long id) {
		return avatarRepository.findOne(id);
		
	}

}
