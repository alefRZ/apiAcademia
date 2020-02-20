package com.spring.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.academy.modal.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
	
	Aluno findById(long id);
	
}
