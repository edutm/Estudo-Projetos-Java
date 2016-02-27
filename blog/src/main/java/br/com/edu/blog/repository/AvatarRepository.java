package br.com.edu.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edu.blog.entity.Avatar;

public interface AvatarRepository extends JpaRepository<Avatar, Long>{

}
