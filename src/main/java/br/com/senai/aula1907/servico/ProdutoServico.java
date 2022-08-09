package br.com.senai.aula1907.servico;

import java.util.List;

import br.com.senai.aula1907.orm.Produtos;

public interface ProdutoServico {
	public List<Produtos> listarProdutos();
}