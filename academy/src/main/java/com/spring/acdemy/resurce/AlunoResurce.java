package com.spring.acdemy.resurce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.academy.modal.Aluno;
import com.spring.academy.repository.AlunoRepository;

@RestController
@RequestMapping(value="/api")
public class AlunoResurce {
	
	@Autowired
	AlunoRepository alunoRepository;
	
	@GetMapping("/alunos")
	public List<Aluno> ListarAlunos(){
		return alunoRepository.findAll();
	}
	
	@GetMapping("/aluno/{id}")
	public Aluno BuscaId(@PathVariable(value="id") long id){
		return alunoRepository.findById(id);
	}
	
	@PostMapping("/aluno")
	public Aluno salvarAluno(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
}
