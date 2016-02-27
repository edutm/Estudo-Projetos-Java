package br.com.edu.blog.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.edu.blog.entity.Avatar;
import br.com.edu.blog.entity.Usuario;
import br.com.edu.blog.repository.UsuarioRepository;
import br.com.edu.blog.service.UsuarioService;

@Service
@Transactional(readOnly=true, propagation=Propagation.REQUIRED)
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> buscarTodos() {
		return usuarioRepository.findAll();
	}

	public Usuario buscarPorId(Long id) {
		return usuarioRepository.findOne(id);
	}

	public Usuario buscarPorEmail(String email) {
		return usuarioRepository.findByEmail(email);
	}

	public Usuario buscarPorAvatar(Avatar avatar) {
		return usuarioRepository.findByAvatar(avatar);
	}

	@Transactional(readOnly=false)
	public void deletar(Long id) {
		usuarioRepository.delete(id);
	}
	
	@Transactional(readOnly=false)
	public void salvar(Usuario usuario) {
		if(usuario.getDataCadastro() == null){
			usuario.setDataCadastro(LocalDate.now());
		}
		
		criptografarSenha(usuario);
		
		usuarioRepository.save(usuario);
	}

	@Transactional(readOnly=false)
	public void updateNameAndEmail(Usuario usuario) {
		usuarioRepository.updateNomeAndEmail(usuario.getNome(), usuario.getEmail(), usuario.getId());
	}

	@Transactional(readOnly=false)
	public void updateSenha(Usuario usuario) {
		criptografarSenha(usuario);
		usuarioRepository.updateSenha(usuario.getSenha(), usuario.getId());
	}
	
	private void criptografarSenha(Usuario usuario) {
		//cripografando senha
		String hash = new BCryptPasswordEncoder().encode(usuario.getSenha());
		usuario.setSenha(hash);
	}

}
