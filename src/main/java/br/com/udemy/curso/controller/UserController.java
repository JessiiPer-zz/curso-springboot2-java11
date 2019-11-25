package br.com.udemy.curso.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.udemy.curso.entity.User;

@RestController
@RequestMapping(value="/users")
public class UserController {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User(1L,"Maria", "maria@maria.com", "112222-7878","123");
		return ResponseEntity.ok(user);
		
	}

}
