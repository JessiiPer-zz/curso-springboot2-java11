package br.com.udemy.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.udemy.curso.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
