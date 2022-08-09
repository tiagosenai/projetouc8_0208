package br.com.senai.aula1907.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.senai.aula1907.orm.Produtos;
import br.com.senai.aula1907.repository.ProdutoRepository;

public class ProdutoServicoCRUD {
	
	@Autowired
	private ProdutoRepository repositorio;
	
	public List<Produtos> listarProdutos(){
		return repositorio.findAll();
	}
}