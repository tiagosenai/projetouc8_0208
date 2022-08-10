package br.com.senai.aula1907.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.aula1907.orm.Categoria;
import br.com.senai.aula1907.orm.Produtos;
import br.com.senai.aula1907.repository.ProdutoRepository;

@Service
public class ProdutoServicoCRUD implements ProdutoServico {
	
	@Autowired
	private ProdutoRepository repositorio;
	
	public List<Produtos> listarProdutos(){
		return repositorio.findAll();
	}
	
	public Produtos salvarProdutos(Produtos produto) {
		return repositorio.save(produto);
	}
	
	public void apagarProdutos(Integer id) {
		repositorio.deleteById(id);
	}
	
	public Produtos consultarProdutosId(Integer id) {
		return repositorio.findById(id).get();
	}
	
	public Produtos atualizarProdutos(Produtos produto) {
		return repositorio.save(produto);
	}
}