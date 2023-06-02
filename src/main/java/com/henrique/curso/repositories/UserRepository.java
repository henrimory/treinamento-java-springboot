package com.henrique.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henrique.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
