package br.com.senai.aula1907.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.senai.aula1907.orm.Categoria;
import br.com.senai.aula1907.repository.CategoriaRepository;

public class CategoriaServicoCRUD implements CategoriaServico{
	
	@Autowired
	private CategoriaRepository repositorio;
	
	public List<Categoria> listarCategorias(){
		return (List<Categoria>) repositorio.findAll();
	}
}